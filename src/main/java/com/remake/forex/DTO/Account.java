package com.remake.forex.DTO;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Account {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;

    String userID;
    double balance;
    double margin;
    double marginUsed;
    String leverage;
}
