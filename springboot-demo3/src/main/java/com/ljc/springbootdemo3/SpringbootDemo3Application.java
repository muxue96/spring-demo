package com.ljc.springbootdemo3;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@SpringBootApplication
@ConfigurationProperties(prefix = "spring.datasource.druid")
public class SpringbootDemo3Application {

    @Autowired
    private Environment environment;

    @Bean
    public DataSource getDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(environment.getProperty("driverClassName"));
        druidDataSource.setUrl("url");
        druidDataSource.setUsername("username");
        druidDataSource.setPassword(environment.getProperty("password"));
        return druidDataSource;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo3Application.class, args);
    }
}
