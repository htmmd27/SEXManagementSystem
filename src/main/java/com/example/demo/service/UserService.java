package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
    int insert(User user);
    int deleteBy(String id);
    int update(User user);
    User getByUsername(String id);
}
