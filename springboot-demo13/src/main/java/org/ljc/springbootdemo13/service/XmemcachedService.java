package org.ljc.springbootdemo13.service;


import cn.hutool.core.util.RandomUtil;
import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.exception.MemcachedException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeoutException;

@Service
public class XmemcachedService {

    @Resource
    private MemcachedClient memcachedClient;

    public String createCode(String code) {
        code = RandomUtil.randomNumbers(6);
        try {
            memcachedClient.set("code",10,code);
        } catch (TimeoutException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (MemcachedException e) {
            throw new RuntimeException(e);
        }
        return code;
    }

    public String getCode(String code) {
        try {
            code = memcachedClient.get("code");
        } catch (TimeoutException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (MemcachedException e) {
            throw new RuntimeException(e);
        }
        return code;
    }
}
