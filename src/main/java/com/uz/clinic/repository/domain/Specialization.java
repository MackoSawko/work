package com.uz.clinic.repository.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Specialization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int specialization_id;
    private String name;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "specialization_id", nullable = false, insertable = false, updatable = false)
    private User doctorSpecialization;

    public Specialization() {
    }

    public int getSpecialization_id() {
        return specialization_id;
    }

    public void setSpecialization_id(int specialization_id) {
        this.specialization_id = specialization_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getDoctorSpecialization() {
        return doctorSpecialization;
    }

    public void setDoctorSpecialization(User doctorSpecialization) {
        this.doctorSpecialization = doctorSpecialization;
    }
}
