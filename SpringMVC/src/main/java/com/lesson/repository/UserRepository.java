package com.lesson.repository;

import com.lesson.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    User getUserById(long id);
}
