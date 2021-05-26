package com.fatec.zl.jwtauth.domain.services;

import com.fatec.zl.jwtauth.application.configs.SecurityConfig;
import com.fatec.zl.jwtauth.data.repositories.UserRepository;
import com.fatec.zl.jwtauth.domain.interfaces.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.fatec.zl.jwtauth.domain.models.User;
import com.fatec.zl.jwtauth.domain.models.UserDetailsImpl;

@Service
public class UserDetailServiceImpl implements UserDetailService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) {
        User u = userRepository.findUserByUsername(username);

        if (u == null)
            throw new UsernameNotFoundException("Usuário não encontrado");

        return new UserDetailsImpl(u);
    }

    @Override
    public UserDetails insertUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return new UserDetailsImpl(userRepository.save(user));
    }
}
