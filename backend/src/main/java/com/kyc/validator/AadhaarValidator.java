package com.kyc.validator;

public class AadhaarValidator {

    public static String validateAadhaar(String aadhaar) {

        if (aadhaar == null || aadhaar.trim().isEmpty()) {
            return "Aadhaar Number cannot be empty";
        }

        // Remove spaces
        aadhaar = aadhaar.trim();

        // Check length
        if (aadhaar.length() != 12) {
            return "Aadhaar Number must contain exactly 12 digits";
        }

        // Check ASCII digits only
        for (int i = 0; i < aadhaar.length(); i++) {

            char ch = aadhaar.charAt(i);

            if (ch < '0' || ch > '9') {
                return "Aadhaar Number must contain only digits";
            }

        }

        // First digit cannot be 0 or 1
        if (aadhaar.charAt(0) == '0' || aadhaar.charAt(0) == '1') {
            return "Aadhaar Number cannot start with 0 or 1";
        }

        // Verhoeff Check
        if (!VerhoeffValidator.validate(aadhaar)) {
            return "Invalid Aadhaar Checksum";
        }

        return "VALID";

    }

}