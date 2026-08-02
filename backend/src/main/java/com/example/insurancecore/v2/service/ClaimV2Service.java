package com.example.insurancecore.v2.service;

import com.example.insurancecore.v2.repository.ClaimV2Repository;
import org.springframework.stereotype.Service;

@Service
public class ClaimV2Service {

    private final ClaimV2Repository claimV2Repository;

    public ClaimV2Service(ClaimV2Repository claimV2Repository) {
        this.claimV2Repository = claimV2Repository;
    }
}
