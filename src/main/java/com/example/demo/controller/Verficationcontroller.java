package com.example.demo.controller;


import com.example.demo.dto.UserResponseDto;
import com.example.demo.entity.Users;
import com.example.demo.service.Userservice;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/verfication")
public class Verficationcontroller {

    @Autowired
    private Userservice userservice;

   @GetMapping
    public ResponseEntity<List<UserResponseDto>> saveusers (){
        return ResponseEntity.ok().body(userservice.getalluser().getBody());
    }

}
