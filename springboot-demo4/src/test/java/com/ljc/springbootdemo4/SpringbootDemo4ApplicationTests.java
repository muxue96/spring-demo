package com.ljc.springbootdemo4;

import com.ljc.springbootdemo4.mapper.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootDemo4ApplicationTests {


    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {

        System.out.println(userDao.getById(1));
        System.out.println(userDao.getById(2));
    }

}
