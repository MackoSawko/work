package com.uz.clinic.controller;

import com.uz.clinic.repository.domain.Rating;
import com.uz.clinic.repository.domain.RatingDTO;
import com.uz.clinic.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rate")
@CrossOrigin(origins = "http://localhost:4200")
public class RatingController {

    @Autowired
    RatingService ratingService;

    @GetMapping
    public List<Rating> getAll() {
        return ratingService.getAll();
    }

    @PostMapping
    public void addRating(@RequestBody RatingDTO rating){
        ratingService.addRate(rating);
    }



}
