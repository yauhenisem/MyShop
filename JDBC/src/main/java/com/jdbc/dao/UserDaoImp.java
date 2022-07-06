package com.jdbc.dao;

import com.jdbc.entity.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDaoImp implements UserDao{
    String url = "jdbc:postgresql://localhost:5432/postgres";
    String user = "postgres";
    String pass = "root";
    @Override
    public User getUseById(long id) {
       try{
           Class.forName("org.postgresql.Driver");
           Connection connection = DriverManager.getConnection(url,user,pass);
           PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE id = ? ");
           preparedStatement.setLong(1,id);
           ResultSet resultSet = preparedStatement.executeQuery();
           resultSet.next();
           User user = new User();
           user.setId(resultSet.getInt("id"));
           user.setName(resultSet.getString("name"));
           user.setAge(resultSet.getInt("age"));
           connection.close();
           return user;

       }catch (Throwable e){
           System.out.println(e.getMessage());
       }
       return new User();
    }
}
