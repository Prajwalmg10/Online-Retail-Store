package com.example.retailStore.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @Column(name ="customer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    @Column(name ="customer_name")
    private String customerName;

    @Column(name="customer_email")
    private String customerEmail;

    @Column(name ="shippingAddress")
    @OneToMany(cascade = CascadeType.ALL,targetEntity = CustomerAddress.class)
    @JoinColumn(name = "customer_addressId", referencedColumnName = "customer_addressId")
    private List<CustomerAddress> customerBillingAddress;

    @Column(name ="billingAddress")
    @OneToMany(cascade = CascadeType.ALL,targetEntity = CustomerAddress.class)
    @JoinColumn(name = "customer_addressId", referencedColumnName = "customer_addressId")
    private List<CustomerAddress> customerShippingAddress;
}
