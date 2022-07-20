package com.shop.controller;

import com.shop.model.User;
import com.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class Control {
    private UserService userService;

    @Autowired
    public Control(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/get")
    String getUserById(@RequestParam long id, ModelMap modelMap) {
        User user = userService.getUserById(id);
        modelMap.addAttribute("someUser", user.toString());
        return "get";
    }

    @DeleteMapping("/delete/{id}")
    void deleteUserById(@PathVariable long id) {
        userService.deleteUserById(id);
    }

    @PostMapping("/create")
    String createUserById(ModelMap modelMap, @RequestParam String name, int age) {
        int lines = userService.createUserByName(name, age);
        modelMap.addAttribute("info", lines);
        return "create";
    }

    @PutMapping("/update")
    void updateUserById(@RequestParam long id, String name) {
        userService.updateUserById(id, name);
    }
}
