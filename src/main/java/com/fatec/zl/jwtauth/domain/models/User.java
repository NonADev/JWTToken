package com.fatec.zl.jwtauth.domain.models;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private String role;
}
