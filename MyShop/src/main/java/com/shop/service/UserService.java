package com.shop.service;

import com.shop.mapper.UserMapper;
import com.shop.model.User;
import com.shop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserRepository {

    private JdbcTemplate jdbcTemplate;
    private UserMapper userMapper;

    @Autowired
    public UserService(JdbcTemplate jdbcTemplate, UserMapper userMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.userMapper = userMapper;
    }

    @Override
    public void createUserByName(User user) {
        jdbcTemplate.update("INSERT INTO users (id,user_first_name,user_age) VALUES (default,?,?)", user.getName(), user.getAge());
    }
//@TimerAnnotation
    @Override
    public User getUserById(long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM users WHERE id =? ", userMapper, id);

    }

    @Override
    public void updateUserById(User user) {
        jdbcTemplate.update("UPDATE users SET user_first_name =?, user_age=? WHERE id=?", user.getName(), user.getAge(), user.getId());
    }

    @Override
    public void deleteUserById(long id) {
        jdbcTemplate.update("DELETE FROM users WHERE id = ?", id);

    }
}
