package org.ljc.springbootdemo13.controller;


import org.ljc.springbootdemo13.service.XmemcachedService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("cache")
public class XmemcachedController {

    @Resource
    private XmemcachedService xmemcachedService;

    @GetMapping
    public String createCode(){
        return xmemcachedService.createCode("");
    }

    @PostMapping
    public String getCode(){
        return xmemcachedService.getCode("");
    }
}
