package com.uz.clinic.repository.domain;

public class SpecializationDTO {

    private String name;
    private int user_id;

    public SpecializationDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
