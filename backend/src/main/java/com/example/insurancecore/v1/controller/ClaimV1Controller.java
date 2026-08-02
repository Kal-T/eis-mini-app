package com.example.insurancecore.v1.controller;

import com.example.insurancecore.v1.service.ClaimV1Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/claims")
public class ClaimV1Controller {

    private final ClaimV1Service claimV1Service;

    public ClaimV1Controller(ClaimV1Service claimV1Service) {
        this.claimV1Service = claimV1Service;
    }
}
