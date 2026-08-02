package com.example.insurancecore.v1.service;

import com.example.insurancecore.v1.repository.UserV1Repository;
import org.springframework.stereotype.Service;

@Service
public class UserV1Service {

    private final UserV1Repository userV1Repository;

    public UserV1Service(UserV1Repository userV1Repository) {
        this.userV1Repository = userV1Repository;
    }
}
