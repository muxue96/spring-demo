package org.ljc.springbootdemo13.bean.config;

import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.XMemcachedClientBuilder;
import org.ljc.springbootdemo13.bean.properties.XMemcachedProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class XmemcachedConfig {

    @Autowired
    private XMemcachedProperties xMemcachedProperties;

    @Bean
    public MemcachedClient getMemcachedClient() throws IOException {
        XMemcachedClientBuilder builder = new XMemcachedClientBuilder(xMemcachedProperties.getServers());
        builder.setConnectionPoolSize(xMemcachedProperties.getPoolSize());
        builder.setOpTimeout(xMemcachedProperties.getOpTimeOut());
        MemcachedClient client = builder.build();
        return client;
    }
}
