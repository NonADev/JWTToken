package com.fatec.zl.jwtauth.domain.interfaces;

import com.fatec.zl.jwtauth.domain.models.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserDetailService extends UserDetailsService {
    UserDetails loadUserByUsername(String username);
    UserDetails insertUser(User user);
}
