package com.jc.controller;

import com.jc.model.TbUser;
import com.jc.service.ITbUserService;
import com.redis.Redis;
import com.util.MD5;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * Created by GeneratorCode on 2019/10/18
 *
 * @author Change
 */

@RestController
@RequestMapping("/tbUser")
public class TbUserController {

    @Resource
    ITbUserService tbUserService;

    @RequestMapping("/login.do")
    public String login(HttpSession session, TbUser tbUser) {
        Date date = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sd.format(date);
        try {
            MD5 md5 = new MD5();
            tbUser.setPassword(md5.getMD5ofStr(tbUser.getPassword()));
            System.out.println(tbUser.getPassword());
            List<TbUser> list = tbUserService.search(tbUser);
            if (list != null || list.size() > 0) {
                TbUser user = list.get(0);
                String userDateEnd = user.getDateEnd();
                user.setDateEnd(format);
                tbUserService.updateSelective(user);
                Redis.set(user.getId() + "", user);
                user.setDateEnd(userDateEnd);
                session.setAttribute("user", user);
                return "true";
            } else {
                return "false";
            }
        } catch (Exception e) {
            return "false";
        }
    }

    @RequestMapping("/insert")
    public ModelAndView insert(TbUser tbUser) {
        tbUser.setPassword(new MD5().getMD5ofStr(tbUser.getPassword()));
        tbUser.setDateStart(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        tbUserService.insert(tbUser);
        return new ModelAndView("redirect:/jsp/error/hello.jsp");
    }

    @RequestMapping("/login.del")
    public String sesDel(HttpSession session) {
        return Redis.sessionEnd(session, (TbUser) session.getAttribute("user"));
    }

    @RequestMapping("/delete")
    public void delete(Integer id) {
        tbUserService.delete(id);
    }

    @RequestMapping("/update")
    public void update(TbUser tbUser) {
        tbUserService.update(tbUser);
    }

    @RequestMapping("/updateSelective")
    public void updateSelective(TbUser tbUser) {
        tbUserService.updateSelective(tbUser);
    }

    @RequestMapping("/load")
    public TbUser load(Integer id) {
        return tbUserService.findById(id);
    }

    @RequestMapping("/list")
    public List<TbUser> list() {
        return (List<TbUser>) tbUserService.findAll();
    }

    @RequestMapping("/search")
    public List<TbUser> search(TbUser tbUser) {
        return tbUserService.search(tbUser);
    }

} 
