package com.ljc.springbootdemo9;

import com.alibaba.druid.pool.DruidDataSource;
import com.ljc.springbootdemo9.domain.UserInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
@EnableConfigurationProperties(UserInfo.class)
public class SpringbootDemo9Application {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource getDataSource(){
        return new DruidDataSource();
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringbootDemo9Application.class, args);
        UserInfo bean = run.getBean(UserInfo.class);
        System.out.println(bean);
        DruidDataSource bean1 = run.getBean(DruidDataSource.class);
        System.out.println(bean1.getDriverClassName());
    }
}
