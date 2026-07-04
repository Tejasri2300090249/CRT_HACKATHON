package com.kyc.controller;

import com.kyc.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/dashboard")
@CrossOrigin(origins = "*")
public class DashboardController {

    @Autowired
    private CustomerRepository repository;

    @GetMapping("/stats")
    public Map<String, Object> getStats() {

        Map<String, Object> data = new HashMap<>();

        long totalCustomers = repository.count();

        data.put("customers", totalCustomers);
        data.put("panValidations", totalCustomers);
        data.put("aadhaarValidations", totalCustomers);
        data.put("history", totalCustomers);

        return data;
    }

}