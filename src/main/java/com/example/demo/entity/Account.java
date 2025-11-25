package com.example.demo.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name="Account")
@Getter
@Setter
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue// For Hibernate 6+
    private Long id;
    @Column(nullable = false,unique = true)
     private Long accountnumber;
    @Column(nullable = false,unique = true)
    private Long crn;
    @Column(nullable = false)
    private String accounttype;
    @Column(nullable = false)
    private String accountname;
    @Column(nullable = false)
    private String accountstatus;
    private Long accountbalance;
    @Column(nullable = false)
    private String accountcurrency;
    @Transient
    @JsonProperty("user_id")
    private Long user_id;
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "user_id")
    private Users users;


}
