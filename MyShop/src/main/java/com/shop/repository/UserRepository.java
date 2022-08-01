package com.shop.repository;

import com.shop.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    void createUserByName(User user);

     User getUserById(long id);

    void updateUserById(User user);

    void deleteUserById(long id);

}
