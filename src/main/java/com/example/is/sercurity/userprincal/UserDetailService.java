package com.example.is.sercurity.userprincal;

import com.example.is.model.Users;
import com.example.is.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService implements UserDetailsService {
    @Autowired
    IUserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = userRepo.findByUserName(username).orElseThrow(()-> new UsernameNotFoundException("User not found -> user name or passWord" + username));
        return UserPrinciple.build(users);
    }
}
