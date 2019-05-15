package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
    int insert(User user);
    int deleteBy(long userName);
    int update(User user);
    User getByUsername(long userName);
}
