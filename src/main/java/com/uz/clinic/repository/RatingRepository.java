package com.uz.clinic.repository;

import com.uz.clinic.repository.domain.Rating;
import org.springframework.data.repository.CrudRepository;

public interface RatingRepository extends CrudRepository<Rating, Integer> {
}
