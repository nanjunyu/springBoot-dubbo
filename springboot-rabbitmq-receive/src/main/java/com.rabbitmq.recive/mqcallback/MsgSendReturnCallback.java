package com.rabbitmq.recive.mqcallback;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

/**
* @Author: Frank
* @Description:
* @Date: Create in  2018/11/29 10:02 PM
* @params: 
* @return:  
*/
public class MsgSendReturnCallback implements RabbitTemplate.ReturnCallback {
    @Override
    public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
        System.out.println("回馈消息："+message);
    }
}
