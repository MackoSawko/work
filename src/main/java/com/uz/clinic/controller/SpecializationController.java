package com.uz.clinic.controller;

import com.uz.clinic.repository.domain.Specialization;
import com.uz.clinic.service.SpecializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/specialization")
@CrossOrigin(origins = "http://localhost:4200")
public class SpecializationController {

    @Autowired
    SpecializationService specializationService;

    @GetMapping
    public List<Specialization> getAll(){
        return specializationService.getAll();
    }

    @PostMapping
    public void addSpecialization(Specialization specialization){
        specializationService.add(specialization);
    }



}
