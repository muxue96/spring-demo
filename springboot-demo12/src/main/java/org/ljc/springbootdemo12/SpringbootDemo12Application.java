package org.ljc.springbootdemo12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootDemo12Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo12Application.class, args);
    }

}
