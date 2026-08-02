package com.example.insurancecore.v1.controller;

import com.example.insurancecore.v1.service.UserV1Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserV1Controller {

    private final UserV1Service userV1Service;

    public UserV1Controller(UserV1Service userV1Service) {
        this.userV1Service = userV1Service;
    }
}
