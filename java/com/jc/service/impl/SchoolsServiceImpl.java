package com.jc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jc.dao.ISchoolsDao;
import com.jc.model.Schools;
import com.jc.service.ISchoolsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author
 * Created by GeneratorCode on 2019/10/15
 */

@Service
public class SchoolsServiceImpl implements ISchoolsService {

    @Resource
    ISchoolsDao dao;

    @Override
    public boolean insert(Object object) {
        return dao.insert(object);
    }
    @Override
    public boolean insertall(List<Schools> object) {
        Map<String,List<Schools>> map = new HashMap<>();
        map.put("lis",object);
        return dao.insertall(object);
    }

    @Override
    public boolean update(Object object) {
        return dao.update(object);
    }

    @Override
    public boolean updateSelective(Object object) {
        return dao.updateSelective(object);
    }

    @Override
    public boolean delete(Object id) {
        Schools schools = findById(id);
        return dao.delete(schools);
    }

    @Override
    public List findAll() {
        return dao.findAll();
    }

    @Override
    public Schools findById(Object id) {
        List<Schools> list = dao.findById(id);
        return list.get(0);
    }

    @Override
    public List<Schools> search(Schools schools) {
        return dao.search(schools);
    }

}