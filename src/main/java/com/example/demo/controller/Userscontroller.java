package com.example.demo.controller;

import com.example.demo.entity.Users;
import com.example.demo.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class Userscontroller {

    @Autowired
    private Userservice userservice;

    @PostMapping("/register")
    public String saveusers(@RequestBody Users users){
        System.out.println(users);
        return userservice.getUserrepo(users);
    }
}
