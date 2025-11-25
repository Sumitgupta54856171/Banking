package com.example.demo.repositery;


import com.example.demo.entity.Users;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Userrepo extends JpaRepository<Users,String> {
    Users findByUsername(String username);
}
