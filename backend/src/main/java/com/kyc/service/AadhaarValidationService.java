package com.kyc.service;

import com.kyc.dto.AadhaarValidationResponse;
import com.kyc.validator.AadhaarValidator;
import org.springframework.stereotype.Service;

@Service
public class AadhaarValidationService {

    public AadhaarValidationResponse validateAadhaar(String aadhaar) {

        // Normalize Input
        aadhaar = aadhaar.trim();

        String result = AadhaarValidator.validateAadhaar(aadhaar);

        if (!result.equals("VALID")) {

            return new AadhaarValidationResponse(
                    false,
                    aadhaar,
                    result
            );
        }

        return new AadhaarValidationResponse(
                true,
                aadhaar,
                "Aadhaar Number is Valid"
        );

    }

}