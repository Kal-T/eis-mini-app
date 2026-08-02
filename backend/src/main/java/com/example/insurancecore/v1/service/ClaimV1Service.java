package com.example.insurancecore.v1.service;

import com.example.insurancecore.v1.repository.ClaimV1Repository;
import org.springframework.stereotype.Service;

@Service
public class ClaimV1Service {

    private final ClaimV1Repository claimV1Repository;

    public ClaimV1Service(ClaimV1Repository claimV1Repository) {
        this.claimV1Repository = claimV1Repository;
    }
}
