package com.example.retailStore.Services.Implementation;

import com.example.retailStore.Models.Customer;
import com.example.retailStore.Repository.CustomerRepository;
import com.example.retailStore.Services.CustomerServices;
import com.example.retailStore.uiResponse.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerServices {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public String saveCustomer(Customer customerModel) {
        return null;
    }

    @Override
    public Customer updateCustomer(Customer customer) throws DataException {
        return null;
    }

    @Override
    public String deleteCustomer(String customerId) throws DataException {
        return null;
    }

    @Override
    public Customer getCustomer(String customerId) throws DataException {
        return null;
    }
}
