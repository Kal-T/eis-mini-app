package com.example.insurancecore.v2.controller;

import com.example.insurancecore.v2.service.ClaimV2Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/claims")
public class ClaimV2Controller {

    private final ClaimV2Service claimV2Service;

    public ClaimV2Controller(ClaimV2Service claimV2Service) {
        this.claimV2Service = claimV2Service;
    }
}
