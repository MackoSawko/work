package com.uz.clinic.repository.domain;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    private String pesel;
    private String email;
    private String password;
    private String userType;
    private String name;
    private String surname;
    private String street;
    private String city;
    private String zipCode;
    private String phone;

    @JsonManagedReference
    @OneToMany(mappedBy = "doctor", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private Set<Visit> visitDoctor;

    @JsonManagedReference
    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private Set<Visit> visitPatient;

    @JsonManagedReference
    @OneToMany(mappedBy = "specializationDoctor", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private Set<Specialization> specializations;

    @JsonManagedReference
    @OneToMany(mappedBy = "ratingDoctor", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private Set<Rating> rateDoctor;

    @JsonManagedReference
    @OneToMany(mappedBy = "ratingUser", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private Set<Rating> rateUser;

    public User() {
    }

    @JsonGetter
    public int getUser_id() {
        return user_id;
    }

    @JsonSetter
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<Visit> getVisitPatient() {
        return visitPatient;
    }

    public void setVisitPatient(Set<Visit> visitPatient) {
        this.visitPatient = visitPatient;
    }

    public Set<Visit> getVisitDoctor() {
        return visitDoctor;
    }

    public void setVisitDoctor(Set<Visit> visitDoctor) {
        this.visitDoctor = visitDoctor;
    }

    public Set<Specialization> getSpecializations() {
        return specializations;
    }

    public void setSpecializations(Set<Specialization> specializations) {
        this.specializations = specializations;
    }

    public Set<Rating> getRateDoctor() {
        return rateDoctor;
    }

    public void setRateDoctor(Set<Rating> rateDoctor) {
        this.rateDoctor = rateDoctor;
    }

    public Set<Rating> getRateUser() {
        return rateUser;
    }

    public void setRateUser(Set<Rating> rateUser) {
        this.rateUser = rateUser;
    }
}
