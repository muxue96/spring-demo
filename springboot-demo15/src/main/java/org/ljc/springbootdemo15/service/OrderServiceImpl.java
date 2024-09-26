package org.ljc.springbootdemo15.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private MessageService messageService;

    @Override
    public void createOrder(String id) {
        //开始处理订单
        System.out.println("开始处理订单");
        messageService.sendMsg(id);
        //订单处理完成
        System.out.println("订单处理完成");
    }
}
