package com.jdbc;
import com.jdbc.dao.UserDaoImp;


public class Main {
    public static void main(String[] args) {
        UserDaoImp userDaoImp = new UserDaoImp();
        System.out.println(userDaoImp.getUseById(2));
    }
}
