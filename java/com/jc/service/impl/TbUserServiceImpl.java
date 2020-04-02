package com.jc.service.impl;

import java.util.List;

import com.jc.dao.ITbUserDao;
import com.jc.model.TbUser;
import com.jc.service.ITbUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by GeneratorCode on 2019/10/18
 *
 * @author Change
 */

@Service
public class TbUserServiceImpl implements ITbUserService {

    @Resource
    ITbUserDao dao;

    @Override
    public boolean insert(Object object) {
        return dao.insert(object);
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
        TbUser tbUser = findById(id);
        return dao.delete(tbUser);
    }

    @Override
    public List findAll() {
        return dao.findAll();
    }

    @Override
    public TbUser findById(Object id) {
        List<TbUser> list = dao.findById(id);
        return list.get(0);
    }

    @Override
    public List<TbUser> search(TbUser tbUser) {
        return dao.search(tbUser);
    }

}