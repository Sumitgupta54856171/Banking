package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO for creating/updating an Account. No ID field here.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountRequestDto {
    private Long accountnumber;
    private Long crn;
    private String accounttype;
    private String accountname;
    private String accountstatus;
    private Long accountbalance;
    private String accountcurrency;
    private Long userId; // link to Users entity
}
