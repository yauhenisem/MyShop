package com.shop.myshopspringboot.service;

import com.shop.myshopspringboot.entity.User;
import com.shop.myshopspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(long id) {
        return userRepository.findById(id);
    }
}


    /*
    @Override
    public void createUserByName(User user) {
        jdbcTemplate.update("INSERT INTO users (id,user_first_name,user_age) VALUES (default,?,?)", user.getName(), user.getAge());
    }

    //@TimerAnnotation
    @Override
   /* public User getUserById(long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM users WHERE id =? ", userMapper, id);

    }

    @Override
    public void updateUserById(User user) {
        jdbcTemplate.update("UPDATE users SET user_first_name =?, user_age=? WHERE id=?", user.getName(), user.getAge(), user.getId());
    }

    @Override
    public void deleteUserById(long id) {
        jdbcTemplate.update("DELETE FROM users WHERE id = ?", id);

    }*/

