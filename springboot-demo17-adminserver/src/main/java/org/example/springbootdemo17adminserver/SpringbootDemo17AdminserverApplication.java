package org.example.springbootdemo17adminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpringbootDemo17AdminserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo17AdminserverApplication.class, args);
    }

}
