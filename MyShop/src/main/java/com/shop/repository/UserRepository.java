package com.shop.repository;
import com.shop.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    int createUserByName(String name, int age);

    User getUserById(long id);

    int updateUserById(long id, String name);

    int deleteUserById(long id);

}
