package com.jc.model;


import lombok.Data;

/**
 * Created by GeneratorCode on 2019/11/04
 *
 * @author Change
 */

@Data
public class TbUser {
    private Integer id;    //ID 
    private String name;    //用户名 
    private String password;    //密码 
    private String sex;    //性别 
    private Integer age;    //年龄 
    private String phone;    //手机号 
    private String email;    //邮箱 
    private String dateStart;    //注册日期 
    private String dateEnd;    //最后一次登陆时间 
    private Double money;    //余额 
    private Integer state;    //状态 

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }


}