package org.ljc.springbootdemo13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootDemo13Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo13Application.class, args);
    }

}
