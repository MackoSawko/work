package com.uz.clinic.service;

import com.uz.clinic.repository.VisitRepository;
import com.uz.clinic.repository.domain.Visit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitService {

    @Autowired
    VisitRepository visitRepository;

    public List<Visit> getAll() {
        return (List<Visit>) visitRepository.findAll();
    }

    public void addVisit(Visit visit) {
        visitRepository.save(visit);
    }
}
