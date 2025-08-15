package com.example.springbootwebsecuritypractice.springsecurity.repo;

import com.example.springbootwebsecuritypractice.springsecurity.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {
    Users findByUsername(String username);
}
