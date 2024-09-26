package org.ljc.springbootdemo15.service.rabbitmq.kafka.listener;


import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageKafkaListener {

    @KafkaListener(topics = "demo")
    public void onMessgae(ConsumerRecord<String,String> record){
        System.out.println("消息已经消费 (kafka) id = "+record.value());
    }
}
