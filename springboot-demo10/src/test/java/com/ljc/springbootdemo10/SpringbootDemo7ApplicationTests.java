package com.ljc.springbootdemo10;

import com.ljc.springbootdemo10.bean.Customer;
import com.ljc.springbootdemo10.mapper.CustomerMapper;
import com.ljc.springbootdemo10.service.CustomerService;
import com.ljc.springbootdemo10.vo.CustomerVo;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan("com.ljc.springbootdemo10.mapper")
class SpringbootDemo7ApplicationTests {

    @Autowired
    private CustomerMapper customerMapper;

    @Test
    void contextLoads() {
        CustomerVo customerVo = new CustomerVo();
        customerVo.setSex(1);
        customerVo.setCustname("小明");
        List<Customer> customers = customerMapper.queryAllCustomer(customerVo);
        customers.forEach(System.out::println);
    }


    @Autowired
    private CustomerService customerService;

    @Test
    void test1(){
        CustomerVo customerVo = new CustomerVo();
        customerVo.setPageNum(2);
        customerVo.setPageSize(3);
        customerService.queryAllCustomer(customerVo);
    }

}
