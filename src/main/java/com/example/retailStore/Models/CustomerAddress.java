package com.example.retailStore.Models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "customer_address")
public class CustomerAddress {


    @Id
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int customerAddressId;

    @Column(name = "doorNo")
    String doorNo;

    @Column(name = "streetName")
    String streetName;

    @Column(name = "layout")
    String layout;

    @Column(name = "city")
    String city;

    @Column(name = "pincode")
    String pincode;

}
