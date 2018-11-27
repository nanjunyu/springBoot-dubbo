package com.example.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.api.UserService;
import com.example.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
/**
* @Author: Frank
* @Description:
* @Date: Create in  2018/11/27 3:21 PM
* @params:
* @return:
*/
public class UserController {


    @Reference
    UserService userService;

    @GetMapping("/findAll")
    public List<User> findAll(){
        return  userService.findAll();
    }


}
