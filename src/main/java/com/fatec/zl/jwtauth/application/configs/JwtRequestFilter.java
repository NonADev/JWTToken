package com.fatec.zl.jwtauth.application.configs;

import com.fatec.zl.jwtauth.domain.interfaces.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtRequestFilter /*extends OncePerRequestFilter*/ {
    @Autowired
    JWTUtil jwtUtil;

    @Autowired
    UserDetailService userDetailService;

    /*@Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {

    }*/
}
