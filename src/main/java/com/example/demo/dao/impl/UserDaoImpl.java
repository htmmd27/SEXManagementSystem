package com.example.demo.dao.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(User User){
        String sql = "insert into teachers(account,password) VALUES(?,?)";
        return this.jdbcTemplate.update(sql, Integer.parseInt(User.getId()),User.getPassword());

    }

    @Override
    public int deleteBy(String id) {
        String sql = "delete from teachers where account = ?";
        return this.jdbcTemplate.update(sql,Integer.parseInt(User.getId()));
    }

    @Override
    public int update(User user) {
        String sql = "update teachers set password = ? where account = ?";
        return this.jdbcTemplate.update(sql,user.getPassword(),Integer.parseInt(User.getId()));
    }

    @Override
    public User getByUsername(String id) {
        String sql = "select account,password from teachers where account = ?";
        return this.jdbcTemplate.queryForObject(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                if(resultSet.wasNull()){
                    return null;
                }
                User user = new User();
                user.setId(String.valueOf(resultSet.getInt("account")));
                user.setPassword(resultSet.getString("password"));
                return user;
            }
        },id);
    }

}
