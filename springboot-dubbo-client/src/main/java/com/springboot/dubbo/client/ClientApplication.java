package com.springboot.dubbo.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
@SpringBootApplication
@ImportResource("classpath:consumer.xml")
/**
* @Author: Frank
* @Description:
* @Date: Create in  2018/11/27 3:26 PM
* @params:
* @return:
*/
public class ClientApplication {

    public static void main(String[] args){
        SpringApplication.run(ClientApplication.class, args);
    }
}
