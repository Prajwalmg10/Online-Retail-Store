package com.example.retailStore.Services.Implementation;

import com.example.retailStore.Models.Customer;
import com.example.retailStore.Services.CustomerServices;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerServices {
    @Override
    public String saveCustomer(Customer customerModel) {
        return null;
    }
}
