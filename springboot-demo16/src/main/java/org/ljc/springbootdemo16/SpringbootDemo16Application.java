package org.ljc.springbootdemo16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootDemo16Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo16Application.class, args);
    }

}
