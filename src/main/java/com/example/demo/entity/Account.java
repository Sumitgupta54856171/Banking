package com.example.demo.entity;


import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Table( name = "account")
class Account {


    @Id
    @UuidGenerator
    @GeneratedValue
    private String id;
    @Column(unique = true,nullable=false)
    private String username;
    @Column(nullable=false)
    private String password;
    @Column(nullable=false)
    private String email;
    @Column(nullable=false)
    private String phone;
    @Column(nullable=false,unique=false)
    private String adharnumber;
    @Column(nullable=false)
    private String address;
    @Column(nullable=false)
    private String role;
    @Column(nullable=false,columnDefinition="ENUM('CURRENT','SAVINGS')")
    private String accounttype;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAdharnumber() {
        return adharnumber;
    }

    public void setAdharnumber(String adharnumber) {
        this.adharnumber = adharnumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}