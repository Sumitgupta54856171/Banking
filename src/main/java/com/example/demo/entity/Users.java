package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;

import java.sql.Timestamp;
import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="users")
public class Users {
    @Id
    @GeneratedValue // For Hibernate 6+
    private Long id;
    @Column(unique = true,nullable=false)
    private String username;
    @Column(nullable=false)
    @NonNull
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
    @Column(nullable = false, length = 20)
    private String Accounttype;
    @Column
    private Boolean isVerified;
    @Column
    private Boolean isChecked;
    @CreationTimestamp
    private Timestamp createdDate;
    @UpdateTimestamp
    private Timestamp updatedDate;

}
