package com.example.demo.dao;

import com.example.demo.entity.User;

public interface UserDao {
    int insert(User user);
    int deleteBy(long userName);
    int update(User user);
    User getByUsername(long userName);


}
