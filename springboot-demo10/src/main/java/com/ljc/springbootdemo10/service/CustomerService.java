package com.ljc.springbootdemo10.service;

import com.ljc.springbootdemo10.bean.Customer;
import com.ljc.springbootdemo10.vo.CustomerVo;
import com.ljc.springbootdemo10.vo.DataGridView;


public interface CustomerService {

    DataGridView queryAllCustomer(CustomerVo customerVo);

    void addCustomer(CustomerVo customerVo);

    void updateCustomer(CustomerVo customerVo);


    void deleteCustomer(String identity);

    Customer findCustomerByIdentity(String identity);
}
