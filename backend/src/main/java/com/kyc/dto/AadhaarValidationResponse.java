package com.kyc.dto;

public class AadhaarValidationResponse {

    private boolean valid;
    private String aadhaarNumber;
    private String message;

    public AadhaarValidationResponse() {
    }

    public AadhaarValidationResponse(boolean valid,
                                     String aadhaarNumber,
                                     String message) {
        this.valid = valid;
        this.aadhaarNumber = aadhaarNumber;
        this.message = message;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}