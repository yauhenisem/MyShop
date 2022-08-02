package com.shop.mapper;

import com.shop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class    UserMapper implements RowMapper<User> {

    private User user;

    @Autowired
    public UserMapper(User user) {
        this.user = user;
    }

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        user.setId(rs.getLong("id"));
        user.setAge(rs.getInt("user_age"));
        user.setName(rs.getString("user_first_name"));
        return user;
    }
}
