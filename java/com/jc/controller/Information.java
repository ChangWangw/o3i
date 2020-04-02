package com.jc.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.Properties;

/**
 * @author Change
 */
@RestController
@RequestMapping("/Information")
public class Information {

    @RequestMapping("/PCInfo")
    public String PCInfo(HttpServletRequest request) {
        Map<String, String> map = System.getenv();
        String localUname = map.get("USERNAME");
        System.out.println(localUname);
        // 获取用户名
        Properties prop = System.getProperties();
        System.out.println("\n当前用户名:" + prop.getProperty("user.name"));
        System.out.println();
        System.out.println("\n当前系统:" + prop.getProperty("os.name"));
//        这2中方式都是获取服务器上的用户名，我怎么从HttpServletRequest中获取
        System.out.println(request.getRemoteUser());

        return "";
    }


}
