package com.ljc.springbootdemo10.controller;


import com.ljc.springbootdemo10.bean.Customer;
import com.ljc.springbootdemo10.constant.ResultObj;
import com.ljc.springbootdemo10.service.CustomerService;
import com.ljc.springbootdemo10.vo.CustomerVo;
import com.ljc.springbootdemo10.vo.DataGridView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@CrossOrigin
@RequestMapping("customer")
public class CustomerController {


    @Autowired
    private CustomerService customerService;



    @GetMapping("{identity}")
    public Customer findCustomerByIdentity(@PathVariable("identity") String identity){
        return this.customerService.findCustomerByIdentity(identity);
    }


    @GetMapping("loadAllCustomer" )
    public DataGridView loadAllCustomer(CustomerVo customerVo){
        return this.customerService.queryAllCustomer(customerVo);
    }


    @PostMapping("addCustomer")
    public ResultObj addCustomer(@RequestBody CustomerVo customerVo){
        try {
            customerVo.setCreatetime(new Date());
            customerService.addCustomer(customerVo);
            return ResultObj.ADD_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.ADD_ERROR;
        }
    }

    @PutMapping("updateCustomer")
    public ResultObj updateCustomer(@RequestBody CustomerVo customerVo){
        try {
            customerService.updateCustomer(customerVo);
            return ResultObj.UPDATE_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.UPDATE_ERROR;
        }
    }


    @DeleteMapping("deleteCustomer")
    public ResultObj deleteCustomer(CustomerVo customerVo){
        try {
            customerService.deleteCustomer(customerVo.getIdentity());
            return ResultObj.DELETE_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.DELETE_ERROR;
        }
    }


}
