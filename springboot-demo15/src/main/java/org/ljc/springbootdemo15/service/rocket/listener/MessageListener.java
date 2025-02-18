package org.ljc.springbootdemo15.service.rocket.listener;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

//@Component
@RocketMQMessageListener(topic = "order_id", consumerGroup = "group_rocketmq")
public class MessageListener implements RocketMQListener<String> {

    @Override
    public void onMessage(String id) {
        System.out.println("已经完成消息收取，id="+id);
    }
}
