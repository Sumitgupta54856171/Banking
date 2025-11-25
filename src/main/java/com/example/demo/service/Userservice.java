package com.example.demo.service;


import com.example.demo.dto.UserResponseDto;
import com.example.demo.entity.Users;
import com.example.demo.map.Usermap;
import com.example.demo.repositery.Userrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.xml.validation.ValidatorHandler;
import java.util.List;

@Service
public class Userservice {

    @Autowired
    private Userrepo userrepo;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private Usermap usermap;

    public String getUserrepo(Users users) {
        if(users == null){
            return "please enter valid data";
        }
        try{
             if(users.getUsername() == null){
                 return "Username cannot be null";
             }
             userrepo.findByUsername(users.getEmail());
             if(userrepo.findByUsername(users.getUsername()) != null){return "Email is already exists enter the another email  address";}

             String encodedPassword= passwordEncoder.encode(users.getPassword()) ;
             users.setPassword(encodedPassword);
             Users user1 = userrepo.save(users);
             return "User created successfully";
        }catch (Exception e){
            return e.getMessage();
        }
    }
    public ResponseEntity<List<UserResponseDto>> getalluser(){
        try{
           return ResponseEntity.ok(usermap.getUser());
    }catch (Exception e){
        return ResponseEntity.badRequest().body(null);
        }
    }

}
