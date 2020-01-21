package com.uz.clinic.repository;

import com.uz.clinic.repository.domain.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Integer> {
}
