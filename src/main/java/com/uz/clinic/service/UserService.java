package com.uz.clinic.service;

import com.uz.clinic.repository.UserRepository;
import com.uz.clinic.repository.domain.User;
import com.uz.clinic.repository.domain.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Optional<User> getById(int id) {
        return userRepository.findById(id);
    }

    public void addUser(UserDTO user) {

        User newUser = new User();

        newUser.setPesel(user.getPesel());
        newUser.setEmail(user.getEmail());
        newUser.setPassword(user.getPassword());
        newUser.setName(user.getName());
        newUser.setSurname(user.getSurname());
        newUser.setUserType(user.getUserType());

        userRepository.save(newUser);
    }

    public List<User> getAll() {
        return (List<User>) userRepository.findAll();
    }

    public void deleteUserById(int id) {
        userRepository.deleteById(id);
    }

    public boolean login(String email, String password){

        User checkingUser = userRepository.findByEmailAndPassword(email, password);

        if(checkingUser.getEmail().equals(email) && checkingUser.getPassword().equals(password)){
            System.out.println("Istnieje taki uzytkownik");
            return true;
        }
        return false;
    }
}
