package org.ljc.springbootdemo13.bean.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "memcached")
public class XMemcachedProperties {

    private String servers;

    private int poolSize;

    private int opTimeOut;
}
