package com.example.retailStore.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "customer_address")
public class CustomerAddress {


    @Column(name = "customer_addressId")
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
