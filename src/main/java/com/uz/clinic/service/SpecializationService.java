package com.uz.clinic.service;

import com.uz.clinic.repository.SpecializationRepository;
import com.uz.clinic.repository.domain.Specialization;
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

    public void add(Specialization specialization) {
        specializationRepository.save(specialization);
    }
}
