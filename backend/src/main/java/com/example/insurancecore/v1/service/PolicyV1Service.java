package com.example.insurancecore.v1.service;

import com.example.insurancecore.v1.repository.PolicyV1Repository;
import org.springframework.stereotype.Service;

@Service
public class PolicyV1Service {

    private final PolicyV1Repository policyV1Repository;

    public PolicyV1Service(PolicyV1Repository policyV1Repository) {
        this.policyV1Repository = policyV1Repository;
    }
}
