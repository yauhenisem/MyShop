package com.lesson.controller;

import com.lesson.model.User;
import com.lesson.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Control {
    UserService userService;
@Autowired
    public Control(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/give/{id}")
    String giveUserById(@PathVariable long id, ModelMap modelMap){
    User user = userService.getUserById(id);
    modelMap.addAttribute("someUser", user.toString());
        System.out.println(user.toString());
        return "result";
    }
}
