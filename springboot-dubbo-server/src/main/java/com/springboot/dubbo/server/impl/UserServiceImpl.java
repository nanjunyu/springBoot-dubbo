package com.example.demo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.api.UserService;
import com.example.demo.dao.UserMapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
* @Author: Frank
* @Description:
* @Date: Create in  2018/11/27 2:19 PM
* @params:
* @return:
*/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
