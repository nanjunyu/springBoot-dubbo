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
//该Service注解是dubbo的注解，不是spring的。若使用xml配置方式暴露接口，则不需要该注解。
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
