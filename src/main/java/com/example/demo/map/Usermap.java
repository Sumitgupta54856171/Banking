package com.example.demo.map;


import com.example.demo.dto.UserResponseDto;
import com.example.demo.entity.Users;
import com.example.demo.repositery.Userrepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class Usermap {

    @Autowired
    private Userrepo userrepo;

    public List<UserResponseDto> getUser(){
        List<Users> users = userrepo.findAll();
        return users
                .stream().map(this::mapuser)
                .collect(Collectors.toList());
    }
    public UserResponseDto mapuser(Users users){
        UserResponseDto user = new UserResponseDto();
        user.setUsername(users.getUsername());
        user.setId(users.getId());
        user.setAccounttype(users.getAccounttype());
        user.setEmail(users.getEmail());
        user.setAddress(users.getAddress());
        user.setAdharnumber(users.getAdharnumber());
        user.setRole(users.getRole());
        user.setPhone(users.getPhone());
        return user;

    }
}