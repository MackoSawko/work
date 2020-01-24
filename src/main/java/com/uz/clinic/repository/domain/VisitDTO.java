package com.uz.clinic.repository.domain;

import java.sql.Date;

public class VisitDTO{

    private User doctor;
    private User user;
    private Date date;


    public VisitDTO() {
    }

    public User getDoctor() {
        return doctor;
    }

    public void setDoctor(User doctor) {
        this.doctor = doctor;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}