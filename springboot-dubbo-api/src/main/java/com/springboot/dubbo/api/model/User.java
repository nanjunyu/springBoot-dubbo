package com.springboot.dubbo.server.model;

import java.io.Serializable;

/**
* @Author: Frank
* @Description:
* @Date: Create in  2018/11/27 3:27 PM
* @params:
* @return:
*/
public class User implements Serializable {
    private Integer id;

    private String userName;

    private String realName;

    private String pwd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", realName='" + realName + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public User() {

    }

    public User(Integer id, String userName, String realName, String pwd) {
        this.id = id;
        this.userName = userName;
        this.realName = realName;
        this.pwd = pwd;
    }
}
