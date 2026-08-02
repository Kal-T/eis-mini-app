package com.example.insurancecore.v2.controller;

import com.example.insurancecore.v2.service.UserV2Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/users")
public class UserV2Controller {

    private final UserV2Service userV2Service;

    public UserV2Controller(UserV2Service userV2Service) {
        this.userV2Service = userV2Service;
    }
}
