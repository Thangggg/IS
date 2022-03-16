package com.example.is.service.impl;

import com.example.is.model.Users;
import com.example.is.repo.IUserRepo;
import com.example.is.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    IUserRepo userRole;
    @Override
    public Optional<Users> findByUsername(String name) {
        return userRole.findByUserName(name);
    }

    @Override
    public Boolean existsByUsername(String username) {
        return userRole.existsByUserName(username);
    }

    @Override
    public Boolean existsByEmail(String email) {
        return userRole.existsByEmail(email);
    }

    @Override
    public Users save(Users users) {
        return userRole.save(users);
    }
}
