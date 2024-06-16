package com.example.retailStore.Repository;

import com.example.retailStore.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,String> {

    Optional<Customer> findByCustomerEmail(String email);
}
