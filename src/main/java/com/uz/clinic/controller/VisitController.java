package com.uz.clinic.controller;

import com.uz.clinic.repository.domain.Visit;
import com.uz.clinic.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visit")
public class VisitController {

    @Autowired
    VisitService visitService;

    @GetMapping
    public List<Visit> getAllVisit(){
        return visitService.getAll();
    }

    @PostMapping
    public void addVisit(@RequestBody Visit visit){
        visitService.addVisit(visit);
    }

}
