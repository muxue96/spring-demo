package com.ljc.springbootdemo10.mapper;

import com.ljc.springbootdemo10.bean.Customer;
import com.ljc.springbootdemo10.vo.CustomerVo;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CustomerMapper {
    /**
     * 查询
     * @param customerVo
     * @return
     */
    List<Customer> queryAllCustomer(CustomerVo customerVo);

    Customer selectCustomerByIdentity(String identity);

    int insertSelective(CustomerVo customerVo);

    int updateByPrimaryKeySelective(CustomerVo customerVo);

    int deleteByPrimaryKey(String identity);


}
