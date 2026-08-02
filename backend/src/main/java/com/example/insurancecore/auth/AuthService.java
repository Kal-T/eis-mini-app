package com.example.insurancecore.auth;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public String generateToken() {
        return "mock-jwt-token-scaffold";
    }
}
