package com.sprintone.trash2cash.dto;

public class UserDetailDTO {

    private String name;
    private String email;
    private int telephone;
    private String imageLink;

    public UserDetailDTO() {
    }

    public UserDetailDTO(String name, String email, int telephone, String imageLink) {
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.imageLink = imageLink;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getTelephone() {
        return telephone;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    @Override
    public String toString() {
        return "UserDetailDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", telephone=" + telephone +
                ", imageLink='" + imageLink + '\'' +
                '}';
    }
}
