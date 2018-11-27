package com.example.demo.api;

import com.example.demo.model.User;

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
