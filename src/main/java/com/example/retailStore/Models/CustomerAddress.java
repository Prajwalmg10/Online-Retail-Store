package com.example.retailStore.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "customer_address")
public class CustomerAddress {


    @Id
    @Column(name = "customer_addressId")
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