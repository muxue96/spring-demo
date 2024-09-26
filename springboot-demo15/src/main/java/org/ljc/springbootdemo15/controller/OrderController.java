package org.ljc.springbootdemo15.controller;


import org.ljc.springbootdemo15.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("{id}")
    public void createOrder(@PathVariable String id){
        orderService.createOrder(id);
    }
}
