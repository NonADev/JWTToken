package com.fatec.zl.jwtauth.application.configs;

import io.jsonwebtoken.Claims;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;
import java.util.function.Function;

@Service
public class JWTUtil {
    public boolean isTokenExpired(String token) {
        return false;
    }

    public boolean validateToken(String token, UserDetails userDetails) {
        return true;
    }

    public String extractUsername(String token) {
        return null;
    }

    public Date extractExpiration(String token) {
        return null;
    }

    private <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        return null;
    }

    private Claims extractAllClaims(String token) {
        return null;
    }

    public String generateToken(UserDetails userDetails) {
        return null;
    }

    private String createToken(Map<String, Object> claims, String subject) {
        return null;
    }
}
