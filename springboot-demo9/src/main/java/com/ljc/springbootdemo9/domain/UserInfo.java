package com.ljc.springbootdemo9.domain;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Data
@ConfigurationProperties(prefix = "userinfo")
@Validated
public class UserInfo {

    @Max(value = 100, message = "最大值不能超过100")
    @Min(value = 0, message = "最小值不能小于0")
    private String userid;

    @Size(max = 5, min = 2)
    private String address;
}
