package com.remake.forex.DTO;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Trade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String ticketID;
    Integer units;
    double exitPrice;
    double cost;
    double profit;

}
