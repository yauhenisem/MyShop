package com.lesson.service;

import com.lesson.mapper.UserMapper;
import com.lesson.model.User;
import com.lesson.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserRepository {
    JdbcTemplate jdbcTemplate;
    UserMapper userMapper;
@Autowired
    public UserService(JdbcTemplate jdbcTemplate, UserMapper userMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.userMapper = userMapper;
    }

    @Override
    public User getUserById(long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM users WHERE id =?", userMapper,id);
    }
}
