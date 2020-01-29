package com.uz.clinic.service;

import com.uz.clinic.repository.SpecializationRepository;
import com.uz.clinic.repository.domain.Specialization;
import com.uz.clinic.repository.domain.SpecializationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecializationService {

    @Autowired
    SpecializationRepository specializationRepository;

    public List<Specialization> getAll() {
        return (List<Specialization>) specializationRepository.findAll();
    }

    public void add(SpecializationDTO specialization) {
        Specialization newSpecialization = new Specialization();
        newSpecialization.setName(specialization.getName());
        newSpecialization.setUser_id(specialization.getUser_id());
        specializationRepository.save(newSpecialization);
    }
}
