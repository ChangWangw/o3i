package com.jc.dao;

import com.jc.model.TbUser;

import java.util.List;

/**
 * Created by GeneratorCode on 2019/10/21
 *
 * @author Change
 */

public interface ITbUserDao {

    boolean insert(Object object);

    boolean update(Object object);

    boolean updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<TbUser> search(TbUser tbUser);

    List findByName(Object name);

    List findByPassword(Object password);

    List findBySex(Object sex);

    List findByAge(Object age);

    List findByPhone(Object phone);

    List findByEmail(Object email);

    List findByDateStart(Object dateStart);

    List findByDateEnd(Object dateEnd);

    List findByMoney(Object money);

    List findByState(Object state);

}