package com.fatec.zl.jwtauth.domain.models;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;

public class UserDetailsImpl implements UserDetails {

    private User user;

    public UserDetailsImpl() {

    }

    public UserDetailsImpl(User u) {
        user.setId(u.getId());
        user.setUsername(u.getUsername());
        user.setRole(u.getRole());
        user.setPassword(u.getPassword());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        GrantedAuthority ga = new SimpleGrantedAuthority(user.getRole());
        return Arrays.asList(ga);
    }

    @Override
    public String getPassword() {
        System.out.println("P:"+user.getPassword());
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
