package com.daniel.authservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @Author: Daniel
 * @Date: 2019/7/29 10:38
 */
@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping("current")
    public Principal getUser(Principal principal){
        return principal;
    }

}
