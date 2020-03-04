package com.p.cosmetics.controller;

import com.p.cosmetics.pojo.User;
import com.p.cosmetics.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    public User findUserById(String id){
        User user = userService.find(id);
        return user;
    }
}
