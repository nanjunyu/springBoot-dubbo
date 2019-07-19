package com.springboot.dubbo.server.dao;

import com.springboot.dubbo.api.model.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @Author: Frank
* @Description:
* @Date: Create in  2018/11/27 3:27 PM
* @params:
* @return:
*/
public interface UserMapper {

    @Select("select id,user_name as userName,real_name as realName,pwd   from user")
    List<User> findAll();
}
