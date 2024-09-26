package org.ljc.springbootdemo15.service.rabbitmq.direct;

import org.ljc.springbootdemo15.service.MessageService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//@Service
public class MessageServiceRabbitmqDirectImpl implements MessageService {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Override
    public void sendMsg(String id) {
        System.out.println("待发送短信的订单已纳入处理队列（rabbitmq direct） id = "+id);
        amqpTemplate.convertAndSend("directExchange","direct1",id);
    }

    @Override
    public String doMsg() {
        return null;
    }
}
