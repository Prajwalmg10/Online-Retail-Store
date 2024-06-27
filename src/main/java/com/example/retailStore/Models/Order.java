package com.example.retailStore.Models;

import javax.persistence.*;
import java.util.List;

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderId;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_item_id",referencedColumnName = "cart_id")
    private List<LineItem> lineItems;
}
