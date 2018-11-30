package com.springboot.dubbo.server.api;

import com.springboot.dubbo.server.model.User;

import java.util.List;

/**
* @Author: Frank
* @Description:
* @Date: Create in  2018/11/27 2:18 PM
* @params:
* @return:
*/
public interface UserService {


    List<User> findAll();
}
