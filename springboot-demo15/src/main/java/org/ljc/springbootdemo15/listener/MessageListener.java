package org.ljc.springbootdemo15.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

//@Component
public class MessageListener {

    @JmsListener(destination = "queue2")
    @SendTo("queue3")
    public String receive(String id){
        System.out.println("已完成短信发送业务，id:"+id);
        return "new:"+id;
    }

}
