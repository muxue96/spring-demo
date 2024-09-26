package org.ljc.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootDemo11Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo11Application.class, args);
    }

}
