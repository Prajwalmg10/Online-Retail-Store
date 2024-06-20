package com.example.retailStore.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
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

    @OneToMany(mappedBy = "customer_address",cascade = CascadeType.ALL)
    private List<CustomerAddress> billingAddress;

    @OneToMany(mappedBy = "customer_address",cascade = CascadeType.ALL)
    private List<CustomerAddress> shippingAddress;
}
