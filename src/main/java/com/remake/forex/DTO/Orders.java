package com.remake.forex.DTO;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String ticketID;
    String userID;
    String type;
    String pair;
    double margin;
    Integer totalUnit;
    Integer availableUnit;
    double entryPrice;
    Integer status;

}
