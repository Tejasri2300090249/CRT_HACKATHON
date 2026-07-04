package com.kyc.validator;

public class PanValidator {

    public static String validatePAN(String pan) {

        if (pan == null || pan.trim().isEmpty()) {
            return "PAN cannot be empty";
        }

        // Remove spaces and convert to uppercase
        pan = pan.trim().toUpperCase();

        if (pan.length() != 10) {
            return "PAN must contain exactly 10 characters";
        }

        // First 5 letters
        for (int i = 0; i < 5; i++) {
            if (!Character.isLetter(pan.charAt(i))) {
                return "First five characters must be alphabets";
            }
        }

        // Next 4 digits
        for (int i = 5; i < 9; i++) {
            if (!Character.isDigit(pan.charAt(i))) {
                return "Characters 6 to 9 must be digits";
            }
        }

        // Last letter
        if (!Character.isLetter(pan.charAt(9))) {
            return "Last character must be an alphabet";
        }

        return "VALID";
    }
}