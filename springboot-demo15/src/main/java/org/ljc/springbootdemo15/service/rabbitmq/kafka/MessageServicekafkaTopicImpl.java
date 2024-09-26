package org.ljc.springbootdemo15.service.rabbitmq.kafka;

import org.ljc.springbootdemo15.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class MessageServicekafkaTopicImpl implements MessageService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @Override
    public void sendMsg(String id) {
        System.out.println("待发送短信的订单已纳入处理队列（rabbitmq direct） id = "+id);
        kafkaTemplate.send("demo",id);
    }
    
    @Override
    public String doMsg() {
        return null;
    }
}
