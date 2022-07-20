package com.shop.model;

import org.springframework.stereotype.Component;

@Component
public class User {
    private long id;
    private String name;
    private int age;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
