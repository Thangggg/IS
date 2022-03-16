package com.example.is.service.impl;

import com.example.is.model.Role;
import com.example.is.model.RoleName;
import com.example.is.repo.IRoleRepo;
import com.example.is.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    IRoleRepo roleRepo;
    @Override
    public Optional<Role> findByName(RoleName roleName) {
        return roleRepo.findByName(roleName);
    }
}
