package com.ljc.springbootdemo8.controller;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {


    @RequestMapping("hello")
    public String hello(){

        log.debug("debug...日志");
        log.info("info...日志");
        log.warn("warn...日志");
        log.error("error...日志");
        return "hello";
    }
}
