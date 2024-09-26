package org.ljc.springbootdemo12.service;


import cn.hutool.core.util.RandomUtil;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EhcacheService {

    @CachePut(value = "codeMsg", key = "#code")
    public String createCode(String code) {
        return RandomUtil.randomNumbers(6).toString();
    }

    @Cacheable(value = "codeMsg", key = "#code")
    public String getCode(String code) {
        return null;
    }
}
