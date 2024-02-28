package com.sprintone.trash2cash.dto;

public class UserOTPDTO {

    private String otp;

    public UserOTPDTO() {
    }

    public UserOTPDTO(String otp) {
        this.otp = otp;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    @Override
    public String toString() {
        return "UserOTPDTO{" +
                "otp='" + otp + '\'' +
                '}';
    }
}
