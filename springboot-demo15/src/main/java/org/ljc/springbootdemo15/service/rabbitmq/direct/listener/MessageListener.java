package org.ljc.springbootdemo15.service.rabbitmq.direct.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

//@Component
public class MessageListener {

    @RabbitListener(queues = "direct_queue_1")
    public void receive(String id){
        System.out.println("已完成短信发送业务(rabbitmq direct) id："+id);
    }
}
