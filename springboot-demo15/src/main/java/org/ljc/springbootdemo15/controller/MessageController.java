package org.ljc.springbootdemo15.controller;


import org.ljc.springbootdemo15.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public String receive(){
        String id = messageService.doMsg();
        return id;
    }
}
