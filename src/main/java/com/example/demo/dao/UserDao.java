package com.example.demo.dao;

import com.example.demo.entity.User;

public interface UserDao {
    int insert(User user);
    int deleteBy(String id);
    int update(User user);
    User getByUsername(String id);


}
