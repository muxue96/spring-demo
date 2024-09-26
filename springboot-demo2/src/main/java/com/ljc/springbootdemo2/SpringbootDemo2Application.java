package com.ljc.springbootdemo2;

import com.ljc.springbootdemo2.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringbootDemo2Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringbootDemo2Application.class, args);
        HelloController bean = applicationContext.getBean(HelloController.class);
        System.out.println(bean);
    }
}
