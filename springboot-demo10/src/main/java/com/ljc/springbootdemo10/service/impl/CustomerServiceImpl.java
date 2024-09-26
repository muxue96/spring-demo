package com.ljc.springbootdemo10.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ljc.springbootdemo10.bean.Customer;
import com.ljc.springbootdemo10.mapper.CustomerMapper;
import com.ljc.springbootdemo10.service.CustomerService;
import com.ljc.springbootdemo10.vo.CustomerVo;
import com.ljc.springbootdemo10.vo.DataGridView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;


    @Override
    @Cacheable(value = "cacheHome", key = "#identity")
    public Customer findCustomerByIdentity(String identity) {
        return customerMapper.selectCustomerByIdentity(identity);
    }

    @Override
    public DataGridView queryAllCustomer(CustomerVo customerVo) {
        Page<Object> page = PageHelper.startPage(customerVo.getPageNum(), customerVo.getPageSize());
        List<Customer> customers = customerMapper.queryAllCustomer(customerVo);
        return new DataGridView(page.getTotal(),customers);
    }

    @Override
    public void addCustomer(CustomerVo customerVo) {
        customerMapper.insertSelective(customerVo);
    }

    @Override
    public void updateCustomer(CustomerVo customerVo) {
        customerMapper.updateByPrimaryKeySelective(customerVo);
    }

    @Override
    public void deleteCustomer(String identity) {
        customerMapper.deleteByPrimaryKey(identity);
    }


}
