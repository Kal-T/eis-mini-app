package com.example.insurancecore.v1.controller;

import com.example.insurancecore.v1.service.PolicyV1Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/policies")
public class PolicyV1Controller {

    private final PolicyV1Service policyV1Service;

    public PolicyV1Controller(PolicyV1Service policyV1Service) {
        this.policyV1Service = policyV1Service;
    }
}
