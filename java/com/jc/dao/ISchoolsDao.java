package com.jc.dao;

import com.jc.model.Schools;

import java.util.List;

/**
 * Created by GeneratorCode on 2019/10/15
 */

public interface ISchoolsDao {

    boolean insert(Object object);

    boolean insertall(Object object);

    boolean update(Object object);

    boolean updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<Schools> search(Schools schools);

    List findByPackageId(Object packageId);

    List findByProperty(Object property);

    List findByName(Object name);

    List findBySite(Object site);

    List findByZone(Object zone);

    List findByPackageName(Object packageName);

    List findByNvrType(Object nvrType);

    List findByNvrIp(Object nvrIp);

    List findByNvrPort(Object nvrPort);

    List findByNvrUesrname(Object nvrUesrname);

    List findByNvrPassword(Object nvrPassword);

    List findByNvrAisle(Object nvrAisle);

    List findByTvIp(Object tvIp);

    List findByTvSpareIp(Object tvSpareIp);

    List findByNetmask(Object netmask);

    List findByGateway(Object gateway);

    List findByPrincipal(Object principal);

    List findByPrincipalPhone(Object principalPhone);

    List findByGeneral(Object general);

    List findByGeneralPhone(Object generalPhone);

    List findByTvInstallState(Object tvInstallState);

    List findByTvInstallNull(Object tvInstallNull);

    List findByTvDebug(Object tvDebug);

    List findByTvDebugRemarks(Object tvDebugRemarks);

    List findByTvInstallRemarks(Object tvInstallRemarks);

    List findByDebugOpsInstall(Object debugOpsInstall);

    List findByTvDescribe(Object tvDescribe);

    List findByTvDebugDate(Object tvDebugDate);

}