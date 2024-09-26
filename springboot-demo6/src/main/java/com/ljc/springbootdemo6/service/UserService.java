package com.ljc.springbootdemo6.service;


import com.ljc.springbootdemo6.beans.User;

public interface UserService {

    /*查询用户*/
    User findUserById(Integer id);

    /*添加用户*/
    void addUser(User user);

    /*修改用户*/
    void updateUser(User user);

    /*删除用户*/
    void deleteUserById(Integer id);
}
