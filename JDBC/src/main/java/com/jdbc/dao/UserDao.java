package com.jdbc.dao;

import com.jdbc.entity.User;

public interface UserDao {
    User getUseById(long id);
}
