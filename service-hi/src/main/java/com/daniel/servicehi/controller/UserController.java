package com.daniel.servicehi.controller;

import com.daniel.servicehi.model.User;
import com.daniel.servicehi.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Daniel
 * @Date: 2019/7/29 16:13
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("registry")
    public User createUser(@RequestParam("username") String username,
                           @RequestParam("password") String password) {
        return userService.create(username,password);
    }

}
