package com.example.demo.repositery;

import com.example.demo.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Accountrepositery extends JpaRepository<Account,String> {

}
