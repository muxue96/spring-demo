package com.ljc.springbootdemo10.vo;


import com.ljc.springbootdemo10.bean.Customer;
import lombok.Data;

/*
*
* 客户的视图信息
*
* */

@Data
public class CustomerVo extends Customer {

    /*
    * 分页参数
    * */

    //页码
    private Integer pageNum;
    //展示数量
    private Integer pageSize;

}
