package com.ljc.springbootdemo10;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ljc.springbootdemo10.mapper")
public class SpringbootDemo7Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo7Application.class, args);
    }

}
