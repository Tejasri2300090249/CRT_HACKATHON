package com.kyc.controller;

import com.kyc.dto.AadhaarRequest;
import com.kyc.dto.AadhaarValidationResponse;
import com.kyc.service.AadhaarValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/validate")
@CrossOrigin(origins = "*")
public class AadhaarValidationController {

    @Autowired
    private AadhaarValidationService service;

    @PostMapping("/aadhaar")
    public AadhaarValidationResponse validate(
            @RequestBody AadhaarRequest request) {

        return service.validateAadhaar(request.getAadhaar());

    }

}