package com.example.insurancecore.v2.service;

import com.example.insurancecore.v2.repository.UserV2Repository;
import org.springframework.stereotype.Service;

@Service
public class UserV2Service {

    private final UserV2Repository userV2Repository;

    public UserV2Service(UserV2Repository userV2Repository) {
        this.userV2Repository = userV2Repository;
    }
}
