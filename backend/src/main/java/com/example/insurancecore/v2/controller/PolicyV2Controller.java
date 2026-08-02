package com.example.insurancecore.v2.controller;

import com.example.insurancecore.v2.service.PolicyV2Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/policies")
public class PolicyV2Controller {

    private final PolicyV2Service policyV2Service;

    public PolicyV2Controller(PolicyV2Service policyV2Service) {
        this.policyV2Service = policyV2Service;
    }
}
