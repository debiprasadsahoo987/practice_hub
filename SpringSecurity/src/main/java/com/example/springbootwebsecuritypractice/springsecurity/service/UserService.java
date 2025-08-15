package com.example.springbootwebsecuritypractice.springsecurity.service;

import com.example.springbootwebsecuritypractice.springsecurity.model.Users;
import com.example.springbootwebsecuritypractice.springsecurity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(12);
    public Users register(Users user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepo.save(user);
    }
}
