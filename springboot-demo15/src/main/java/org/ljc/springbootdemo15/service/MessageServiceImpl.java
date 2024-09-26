package org.ljc.springbootdemo15.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;


//@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Override
    public void sendMsg(String id) {
        System.out.println("发送的消息已经进入mq队列 id=" + id);
        jmsMessagingTemplate.convertAndSend("queue2",id);
    }

    @Override
    public String doMsg() {
        String id = jmsMessagingTemplate.receiveAndConvert("queue2",String.class);
        System.out.println("已经完成信息业务，id=" + id);
        return id;
    }
}
