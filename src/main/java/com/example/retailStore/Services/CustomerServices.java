package com.example.retailStore.Services;

import com.example.retailStore.Models.Customer;
import org.springframework.stereotype.Service;

public interface CustomerServices {
    String saveCustomer(Customer customerModel);
}
