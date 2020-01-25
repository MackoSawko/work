package com.uz.clinic.repository;

import com.uz.clinic.repository.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByEmailAndPassword(String email, String password);


}
