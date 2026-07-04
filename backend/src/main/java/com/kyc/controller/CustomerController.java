package com.kyc.controller;

import java.util.List;

import com.kyc.model.Customer;
import com.kyc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
@CrossOrigin(origins = "*")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping("/register")
    public Customer registerCustomer(@RequestBody Customer customer) {
        return service.registerCustomer(customer);
    }

    @GetMapping("/history")
    public List<Customer> getAllCustomers() {
        return service.getAllCustomers();
    }
}