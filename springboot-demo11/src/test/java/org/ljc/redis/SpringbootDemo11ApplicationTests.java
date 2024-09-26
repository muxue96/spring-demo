package org.ljc.redis;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;

@SpringBootTest
class SpringbootDemo11ApplicationTests {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void contextLoads() {
        String code = stringRedisTemplate.opsForValue().get("login:code:13456789025");
        System.out.println(code);
    }

}
