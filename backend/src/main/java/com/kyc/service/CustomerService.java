package com.kyc.service;

import java.util.List;

import com.kyc.model.Customer;
import com.kyc.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public Customer registerCustomer(Customer customer) {

        if (repository.existsByEmail(customer.getEmail())) {
            throw new RuntimeException("Email already exists");
        }

        if (repository.existsByPan(customer.getPan())) {
            throw new RuntimeException("PAN already exists");
        }

        if (repository.existsByAadhaar(customer.getAadhaar())) {
            throw new RuntimeException("Aadhaar already exists");
        }

        return repository.save(customer);
    }

    // NEW METHOD
    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }
}