package com.lesson.mapper;

import com.lesson.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class UserMapper implements RowMapper<User> {
    User user;
@Autowired
    public UserMapper(User user) {
        this.user = user;
    }

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        user.setId(rs.getLong("id"));
        user.setName(rs.getString("name"));
        user.setAge(rs.getInt("age"));
    return user;
    }
}
