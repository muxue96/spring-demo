package com.ljc.springbootdemo6.service.impl;


import com.ljc.springbootdemo6.beans.User;
import com.ljc.springbootdemo6.dao.UseDAO;
import com.ljc.springbootdemo6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UseDAO useDAO;

    @Override
    public User findUserById(Integer id) {
        return useDAO.getById(id);
    }

    @Override
    public void addUser(User user) {
        useDAO.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        useDAO.updateUser(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        useDAO.deleteUser(id);
    }
}
