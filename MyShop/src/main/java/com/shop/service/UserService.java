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
    public int createUserByName(String name, int age) {
        return jdbcTemplate.update("INSERT INTO users (id,user_first_name,user_age) VALUES (default,?,?)", name, age);// Update подходит тут метод?)
    }

    @Override
    public User getUserById(long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM users WHERE id =? ", userMapper, id);

    }

    @Override
    public int updateUserById(long id, String name) {
        return jdbcTemplate.update("UPDATE users SET user_first_name =? WHERE id=?", name, id);  //ПОчему запрос начиная с FROM не вопринимается ?)
    }

    @Override
    public int deleteUserById(long id) {
        return jdbcTemplate.update("DELETE FROM users WHERE id = ?", id); // Какой метод использовать для удаления?) Update не подходит а делите нету.

    }
}
