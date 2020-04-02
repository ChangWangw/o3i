package com.jc.service;

import com.jc.model.TbUser;

import java.util.List;

/**
 * Created by GeneratorCode on 2019/10/18
 *
 * @author Change
 */
public interface ITbUserService {

    boolean insert(Object object);

    boolean update(Object object);

    boolean updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    TbUser findById(Object id);

    List<TbUser> search(TbUser tbUser);

}