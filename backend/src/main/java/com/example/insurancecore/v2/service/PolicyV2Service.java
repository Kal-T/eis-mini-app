package com.example.insurancecore.v2.service;

import com.example.insurancecore.v2.repository.PolicyV2Repository;
import org.springframework.stereotype.Service;

@Service
public class PolicyV2Service {

    private final PolicyV2Repository policyV2Repository;

    public PolicyV2Service(PolicyV2Repository policyV2Repository) {
        this.policyV2Repository = policyV2Repository;
    }
}
