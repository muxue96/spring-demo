package com.ljc.springbootdemo6.controller;


import com.ljc.springbootdemo6.beans.User;
import com.ljc.springbootdemo6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/find/{id}")
    public String findUser(@PathVariable Integer id){
        User user = userService.findUserById(id);
        System.out.println(user);
        return "success";
    }
}
