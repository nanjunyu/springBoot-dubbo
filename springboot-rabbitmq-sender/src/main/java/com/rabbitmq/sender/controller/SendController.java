package com.rabbitmq.sender.controller;

import com.rabbitmq.sender.service.FirstSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
* @Author: Frank
* @Description: 测试发送
* @Date: Create in  2018/11/29 10:02 PM
* @params:
* @return:
*/
@RestController
public class SendController {

    @Autowired
    private FirstSender firstSender;

    @GetMapping("/send")
    public String send(String message){
        String uuid = UUID.randomUUID().toString();
        System.out.println("准备发送mq消息了:message="+message);
        firstSender.send(uuid,message);
        return uuid;
    }
}
