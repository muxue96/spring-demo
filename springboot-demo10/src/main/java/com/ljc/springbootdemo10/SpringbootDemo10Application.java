package com.ljc.springbootdemo10;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.ljc.springbootdemo10.mapper")
@EnableCaching
public class SpringbootDemo10Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo10Application.class, args);
    }

}
