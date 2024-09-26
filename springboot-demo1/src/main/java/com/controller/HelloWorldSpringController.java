package com.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldSpringController {


    @RequestMapping("/hello")
    public String hello(String name){
        return "hello springboot";
    }
}
