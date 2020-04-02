package com.jc.model;


/**
 * Created by GeneratorCode on 2019/10/15
 */

public class Schools {
    private Integer id;    //编号 
    private Integer packageId;    //包号 
    private String property;    //性质 
    private String name;    //学校名称 
    private String site;    //学校地址 
    private String zone;    //分区 
    private String packageName;    //包件 
    private String nvrType;    //NVR类型 
    private String nvrIp;    //NVR的ip 
    private Integer nvrPort;    //NVR端口 
    private String nvrUesrname;    //NVR用户名 
    private String nvrPassword;    //NVR密码 
    private String nvrAisle;    //NVR通道 
    private String tvIp;    //大屏ip 
    private String tvSpareIp;    //大屏备用ip 
    private String netmask;    //子网 
    private String gateway;    //网关 
    private String principal;    //校长 
    private String principalPhone;    //校长电话 
    private String general;    //总务 
    private String generalPhone;    //总务电话 
    private String tvInstallState;    //大屏安装状态 
    private String tvInstallNull;    //大屏无法安装 
    private String tvDebug;    //大屏调试 
    private String tvDebugRemarks;    //大屏调试备注 
    private String tvInstallRemarks;    //大屏安装备注 
    private String debugOpsInstall;    //调试ops安装 
    private String tvDescribe;    //大屏信息 
    private String tvDebugDate;    //调试日期

    @Override
    public String toString() {
        return "Schools{" +
                "id=" + id +
                ", packageId=" + packageId +
                ", property='" + property + '\'' +
                ", name='" + name + '\'' +
                ", site='" + site + '\'' +
                ", zone='" + zone + '\'' +
                ", packageName='" + packageName + '\'' +
                ", nvrType='" + nvrType + '\'' +
                ", nvrIp='" + nvrIp + '\'' +
                ", nvrPort=" + nvrPort +
                ", nvrUesrname='" + nvrUesrname + '\'' +
                ", nvrPassword='" + nvrPassword + '\'' +
                ", nvrAisle='" + nvrAisle + '\'' +
                ", tvIp='" + tvIp + '\'' +
                ", tvSpareIp='" + tvSpareIp + '\'' +
                ", netmask='" + netmask + '\'' +
                ", gateway='" + gateway + '\'' +
                ", principal='" + principal + '\'' +
                ", principalPhone='" + principalPhone + '\'' +
                ", general='" + general + '\'' +
                ", generalPhone='" + generalPhone + '\'' +
                ", tvInstallState='" + tvInstallState + '\'' +
                ", tvInstallNull='" + tvInstallNull + '\'' +
                ", tvDebug='" + tvDebug + '\'' +
                ", tvDebugRemarks='" + tvDebugRemarks + '\'' +
                ", tvInstallRemarks='" + tvInstallRemarks + '\'' +
                ", debugOpsInstall='" + debugOpsInstall + '\'' +
                ", tvDescribe='" + tvDescribe + '\'' +
                ", tvDebugDate='" + tvDebugDate + '\'' +
                '}';
    }

    public Schools(Integer id, Integer packageId, String property, String name, String site, String zone, String packageName, String nvrType, String nvrIp, Integer nvrPort, String nvrUesrname, String nvrPassword, String nvrAisle, String tvIp, String tvSpareIp, String netmask, String gateway, String principal, String principalPhone, String general, String generalPhone, String tvInstallState, String tvInstallNull, String tvDebug, String tvDebugRemarks, String tvInstallRemarks, String debugOpsInstall, String tvDescribe, String tvDebugDate) {
        this.id = id;
        this.packageId = packageId;
        this.property = property;
        this.name = name;
        this.site = site;
        this.zone = zone;
        this.packageName = packageName;
        this.nvrType = nvrType;
        this.nvrIp = nvrIp;
        this.nvrPort = nvrPort;
        this.nvrUesrname = nvrUesrname;
        this.nvrPassword = nvrPassword;
        this.nvrAisle = nvrAisle;
        this.tvIp = tvIp;
        this.tvSpareIp = tvSpareIp;
        this.netmask = netmask;
        this.gateway = gateway;
        this.principal = principal;
        this.principalPhone = principalPhone;
        this.general = general;
        this.generalPhone = generalPhone;
        this.tvInstallState = tvInstallState;
        this.tvInstallNull = tvInstallNull;
        this.tvDebug = tvDebug;
        this.tvDebugRemarks = tvDebugRemarks;
        this.tvInstallRemarks = tvInstallRemarks;
        this.debugOpsInstall = debugOpsInstall;
        this.tvDescribe = tvDescribe;
        this.tvDebugDate = tvDebugDate;
    }

    public Schools() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getNvrType() {
        return nvrType;
    }

    public void setNvrType(String nvrType) {
        this.nvrType = nvrType;
    }

    public String getNvrIp() {
        return nvrIp;
    }

    public void setNvrIp(String nvrIp) {
        this.nvrIp = nvrIp;
    }

    public Integer getNvrPort() {
        return nvrPort;
    }

    public void setNvrPort(Integer nvrPort) {
        this.nvrPort = nvrPort;
    }

    public String getNvrUesrname() {
        return nvrUesrname;
    }

    public void setNvrUesrname(String nvrUesrname) {
        this.nvrUesrname = nvrUesrname;
    }

    public String getNvrPassword() {
        return nvrPassword;
    }

    public void setNvrPassword(String nvrPassword) {
        this.nvrPassword = nvrPassword;
    }

    public String getNvrAisle() {
        return nvrAisle;
    }

    public void setNvrAisle(String nvrAisle) {
        this.nvrAisle = nvrAisle;
    }

    public String getTvIp() {
        return tvIp;
    }

    public void setTvIp(String tvIp) {
        this.tvIp = tvIp;
    }

    public String getTvSpareIp() {
        return tvSpareIp;
    }

    public void setTvSpareIp(String tvSpareIp) {
        this.tvSpareIp = tvSpareIp;
    }

    public String getNetmask() {
        return netmask;
    }

    public void setNetmask(String netmask) {
        this.netmask = netmask;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getPrincipalPhone() {
        return principalPhone;
    }

    public void setPrincipalPhone(String principalPhone) {
        this.principalPhone = principalPhone;
    }

    public String getGeneral() {
        return general;
    }

    public void setGeneral(String general) {
        this.general = general;
    }

    public String getGeneralPhone() {
        return generalPhone;
    }

    public void setGeneralPhone(String generalPhone) {
        this.generalPhone = generalPhone;
    }

    public String getTvInstallState() {
        return tvInstallState;
    }

    public void setTvInstallState(String tvInstallState) {
        this.tvInstallState = tvInstallState;
    }

    public String getTvInstallNull() {
        return tvInstallNull;
    }

    public void setTvInstallNull(String tvInstallNull) {
        this.tvInstallNull = tvInstallNull;
    }

    public String getTvDebug() {
        return tvDebug;
    }

    public void setTvDebug(String tvDebug) {
        this.tvDebug = tvDebug;
    }

    public String getTvDebugRemarks() {
        return tvDebugRemarks;
    }

    public void setTvDebugRemarks(String tvDebugRemarks) {
        this.tvDebugRemarks = tvDebugRemarks;
    }

    public String getTvInstallRemarks() {
        return tvInstallRemarks;
    }

    public void setTvInstallRemarks(String tvInstallRemarks) {
        this.tvInstallRemarks = tvInstallRemarks;
    }

    public String getDebugOpsInstall() {
        return debugOpsInstall;
    }

    public void setDebugOpsInstall(String debugOpsInstall) {
        this.debugOpsInstall = debugOpsInstall;
    }

    public String getTvDescribe() {
        return tvDescribe;
    }

    public void setTvDescribe(String tvDescribe) {
        this.tvDescribe = tvDescribe;
    }

    public String getTvDebugDate() {
        return tvDebugDate;
    }

    public void setTvDebugDate(String tvDebugDate) {
        this.tvDebugDate = tvDebugDate;
    }

}