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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "billing_address_id", referencedColumnName = "address_id")
    private CustomerAddress billingAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "shipping_address_id", referencedColumnName = "address_id")
    private CustomerAddress shippingAddress;
}
