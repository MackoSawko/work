package com.uz.clinic.controller;

import com.uz.clinic.repository.domain.User;
import com.uz.clinic.repository.domain.UserDTO;
import com.uz.clinic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable int id){
        return userService.getById(id);
    }

    @PostMapping("/addUser")
    public void addUser(@RequestBody UserDTO user){
        userService.addUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id){
        userService.deleteUserById(id);
    }

    @PostMapping("/login")
    public boolean login(@Param("email") String email, @Param("password") String password){
        return userService.login(email, password);
    }


    public UserController() {
    }
}
