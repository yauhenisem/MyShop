package com.aop.service;

import com.aop.annotation.MyAnnotatio;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @MyAnnotatio
    public void say(){
        System.out.println("Privet");
    }
}
