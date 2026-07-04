package com.kyc.service;

import com.kyc.dto.PanValidationResponse;
import com.kyc.validator.PanValidator;
import org.springframework.stereotype.Service;

@Service
public class PanValidationService {

    public PanValidationResponse validatePan(String pan) {

        // Normalize input
        pan = pan.trim().toUpperCase();

        // Validate PAN structure
        String result = PanValidator.validatePAN(pan);

        if (!result.equals("VALID")) {
            return new PanValidationResponse(
                    false,
                    pan,
                    "Unknown",
                    result
            );
        }

        // Category Validation
        char categoryLetter = pan.charAt(3);

        String category;

        switch (categoryLetter) {

            case 'P':
                category = "Individual";
                break;

            case 'C':
                category = "Company";
                break;

            case 'H':
                category = "HUF";
                break;

            case 'F':
                category = "Firm";
                break;

            case 'A':
                category = "Association of Persons";
                break;

            case 'T':
                category = "Trust";
                break;

            case 'G':
                category = "Government";
                break;

            case 'L':
                category = "Local Authority";
                break;

            case 'J':
                category = "Artificial Juridical Person";
                break;

            case 'B':
                category = "Body of Individuals";
                break;

            default:
                return new PanValidationResponse(
                        false,
                        pan,
                        "Unknown",
                        "Invalid PAN Category Letter"
                );
        }

        return new PanValidationResponse(
                true,
                pan,
                category,
                "PAN Format Valid"
        );
    }

}