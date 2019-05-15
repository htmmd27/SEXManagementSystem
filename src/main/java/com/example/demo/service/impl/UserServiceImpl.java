package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public int deleteBy(long userName) {
        return userDao.deleteBy(userName);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public User getByUsername(long userName) {
        return userDao.getByUsername(userName);
    }
}
