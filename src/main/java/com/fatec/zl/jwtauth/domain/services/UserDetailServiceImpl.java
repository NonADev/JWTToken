package com.fatec.zl.jwtauth.domain.services;

import com.fatec.zl.jwtauth.data.repositories.UserRepository;
import com.fatec.zl.jwtauth.domain.interfaces.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {
        return null;
    }
}
