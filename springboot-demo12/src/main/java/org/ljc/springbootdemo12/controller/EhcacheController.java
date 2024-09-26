package org.ljc.springbootdemo12.controller;


import org.ljc.springbootdemo12.service.EhcacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cache")
public class EhcacheController {

    @Autowired
    private EhcacheService ehcacheService;

    @GetMapping
    public String createCode(){
        String code = ehcacheService.createCode("");
        return code;
    }


    @PostMapping
    public String getCode(){
        String code = ehcacheService.getCode("");
        return code;
    }


}
