package com.rabbitmq.recive.counsumer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
* @Author: Frank
* @Description:
* @Date: Create in  2018/11/29 9:46 PM
* @params:
* @return:
*/
@Component
public class FirstConsumer {

    /**
     * queues  指定从哪个队列（queue）订阅消息
     * @param message
     */
    @RabbitListener(queues = {"first-queue"})
    public void handleMessage(Message message){
        // 处理消息
        System.out.println("FirstConsumer {} handleMessage :"+message);
    }
}
