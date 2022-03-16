package com.example.is.service;

import com.example.is.model.Role;
import com.example.is.model.RoleName;

import java.util.Optional;

public interface IRoleService {
    Optional<Role> findByName(RoleName roleName);
}
