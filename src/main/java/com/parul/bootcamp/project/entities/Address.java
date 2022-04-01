package com.parul.bootcamp.project.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*

ADDRESS
ID
CITY
STATE
COUNTRY
ADDRESS_LINE
ZIP_CODE
LABEL (Ex. office/home)
USER_ID //key
* */
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    //key
    int userId;

    String city;
    String state;
    String country;
    String addressLine;
    String zipCode;
    String label;

}