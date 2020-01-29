package com.uz.clinic.repository.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rating_id;
    private String description;
    private int rate;
    private int user_id;
    private int doctor_id;

    @JsonBackReference
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false, insertable = false, updatable = false)
    private User ratingUser;

    @JsonBackReference
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id", nullable = false, insertable = false, updatable = false)
    private User ratingDoctor;

    public Rating() {
    }

    public int getRating_id() {
        return rating_id;
    }

    public void setRating_id(int rating_id) {
        this.rating_id = rating_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public User getRatingDoctor() {
        return ratingDoctor;
    }

    public void setRatingDoctor(User ratingDoctor) {
        this.ratingDoctor = ratingDoctor;
    }

    public User getRatingUser() {
        return ratingUser;
    }

    public void setRatingUser(User ratingUser) {
        this.ratingUser = ratingUser;
    }
}
