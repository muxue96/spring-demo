package com.ljc.springbootdemo5;

import com.ljc.springbootdemo5.bean.User;
import com.ljc.springbootdemo5.mapper.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootDemo5ApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {
        User user = userDao.selectById(2);
        System.out.println(user);
    }

}
