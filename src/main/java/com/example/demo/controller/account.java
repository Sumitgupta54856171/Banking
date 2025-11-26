package com.example.demo.controller;


import com.example.demo.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class account {


    @Autowired
    private Userservice userservice;
}
