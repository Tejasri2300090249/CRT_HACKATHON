package com.kyc.controller;

import com.kyc.dto.PanRequest;
import com.kyc.dto.PanValidationResponse;
import com.kyc.service.PanValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/validate")
@CrossOrigin(origins = "*")
public class PanValidationController {

    @Autowired
    private PanValidationService service;

    @PostMapping("/pan")
    public PanValidationResponse validatePan(@RequestBody PanRequest request) {

        return service.validatePan(request.getPan());

    }
}