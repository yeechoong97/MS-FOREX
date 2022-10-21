package com.remake.forex.DTO;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String userName;
    String userID;
    String name;
    String email;
    String phone;
    String avatar;
    Integer tutorial;
    String password;
}
