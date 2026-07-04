package com.kyc.dto;

public class PanValidationResponse {

    private boolean valid;
    private String panNumber;
    private String category;
    private String message;

    public PanValidationResponse() {
    }

    public PanValidationResponse(boolean valid, String panNumber, String category, String message) {
        this.valid = valid;
        this.panNumber = panNumber;
        this.category = category;
        this.message = message;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}