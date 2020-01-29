package com.uz.clinic.service;

import com.uz.clinic.repository.VisitRepository;
import com.uz.clinic.repository.domain.User;
import com.uz.clinic.repository.domain.Visit;
import com.uz.clinic.repository.domain.VisitDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VisitService {

    @Autowired
    VisitRepository visitRepository;

    @Autowired
    UserService userService;

    public List<Visit> getAll() {
        return (List<Visit>) visitRepository.findAll();
    }

    public void addVisit(VisitDTO visit) {

        Visit newVisit = new Visit();

        newVisit.setDate(visit.getDate());
        newVisit.setUzytkownikId(visit.getUser_id());
        newVisit.setDoktorId(visit.getDoctor_id());

        visitRepository.save(newVisit);
    }
}
