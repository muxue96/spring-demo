package org.ljc.springbootdemo15.service.rabbitmq.topic.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

//@Component
public class MessageListener1 {

    @RabbitListener(queues = "topic_queue_2")
    public void recevice(String id){
        System.out.println("MessageListener1 已完成短信发送业务(rabbitmq direct) id："+id);
    }
}
