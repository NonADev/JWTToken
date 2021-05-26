package com.fatec.zl.jwtauth.application.controllers;

import com.fatec.zl.jwtauth.application.configs.JWTUtil;
import com.fatec.zl.jwtauth.application.configs.SecurityConfig;
import com.fatec.zl.jwtauth.domain.interfaces.UserDetailService;
import com.fatec.zl.jwtauth.domain.models.UsuarioCredenciais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LoginController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailService userDetailService;

    @Autowired
    private JWTUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UsuarioCredenciais usuarioCredenciais) {
        try {
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new Error(e.getMessage()));
        }
    }

    @GetMapping("/lista")
    public ResponseEntity<?> listaPets() {
        try {
            List<String> lista = new ArrayList<>();
            lista.add("pet1");
            lista.add("pet2");
            lista.add("pet3");
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new Error(e.getMessage()));
        }
    }

    @GetMapping("/ping")
    public ResponseEntity<?> ping(@RequestParam(value = "password", required = false) String password) {
        try {
            if (password != null)
                System.out.println(password);
            return ResponseEntity.ok(System.currentTimeMillis());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new Error(e.getMessage()));
        }
    }
}
