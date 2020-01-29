package com.uz.clinic.service;

import com.uz.clinic.repository.RatingRepository;
import com.uz.clinic.repository.domain.Rating;
import com.uz.clinic.repository.domain.RatingDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {

    @Autowired
    RatingRepository ratingRepository;

    public List<Rating> getAll() {
        return (List<Rating>) ratingRepository.findAll();
    }

    public void addRate(RatingDTO rating) {
        Rating newRating = new Rating();
        newRating.setDescription(rating.getDescription());
        newRating.setRate(rating.getRate());
        newRating.setDoctor_id(rating.getDoctor_id());
        newRating.setUser_id(rating.getUser_id());
        ratingRepository.save(newRating);
    }
}
