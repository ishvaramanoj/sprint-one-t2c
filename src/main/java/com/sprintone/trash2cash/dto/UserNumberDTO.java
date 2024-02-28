package com.sprintone.trash2cash.dto;

public class UserNumberDTO {

    private int telephone;

    public UserNumberDTO() {
    }

    public UserNumberDTO(int telephone) {
        this.telephone = telephone;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "UserNumberDTO{" +
                "telephone=" + telephone +
                '}';
    }
}
