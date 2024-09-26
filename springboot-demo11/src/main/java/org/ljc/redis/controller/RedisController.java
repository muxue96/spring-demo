package org.ljc.redis.controller;


import org.ljc.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cache")
public class RedisController {

    @Autowired
    private RedisService redisService;


    @GetMapping
    public String createCode(){
        String code = redisService.createCode("");
        return code;
    }

    @PostMapping
    public String getCode(){
        String code = redisService.getCode("");
        return code;
    }
}
