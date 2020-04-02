package com.jc.service;

import com.jc.model.Schools;

import java.util.List;

/**
 * Created by GeneratorCode on 2019/10/15
 *
 * @author Change
 */
public interface ISchoolsService {

    boolean insert(Object object);

    boolean insertall(List<Schools> object);

    boolean update(Object object);

    boolean updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    Schools findById(Object id);

    List<Schools> search(Schools schools);

}