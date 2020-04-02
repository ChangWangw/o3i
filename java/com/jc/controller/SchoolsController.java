package com.jc.controller;

import com.jc.model.Schools;
import com.jc.service.ISchoolsService;
import com.poitest.UploadExcel;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * Created by GeneratorCode on 2019/10/15
 *
 * @author Change
 */

@RestController
@RequestMapping("/schools")
public class SchoolsController {

    @Resource
    ISchoolsService schoolsService;


    @RequestMapping("/insert")
    public String insert() {
        try {
                schoolsService.insertall(UploadExcel.readExcel());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
    }

    @RequestMapping("/delete")
    public void delete(Integer id) {
        schoolsService.delete(id);
    }

    @RequestMapping("/update")
    public void update(Schools schools) {
        schoolsService.update(schools);
    }

    @RequestMapping("/updateSelective")
    public void updateSelective(Schools schools) {
        schoolsService.updateSelective(schools);
    }

    @RequestMapping("/load")
    public Schools load(Integer id) {
        Schools schools = schoolsService.findById(id);
        return schools;
    }

    @RequestMapping("/list")
    public List<Schools> list() {
        List<Schools> list = schoolsService.findAll();
        return list;
    }

    @RequestMapping("/search")
    public List<Schools> search(Schools schools) {
        List<Schools> list = schoolsService.search(schools);
        return list;
    }

} 
