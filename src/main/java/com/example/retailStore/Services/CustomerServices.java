package com.example.retailStore.Services;

import com.example.retailStore.Models.Customer;
import com.example.retailStore.uiResponse.DataException;

public interface CustomerServices {
    String saveCustomer(Customer customerModel) throws DataException;

    Customer updateCustomer(Customer customer) throws DataException;

    String deleteCustomer(String customerId) throws DataException;

    Customer getCustomer(String customerId) throws DataException;

}
