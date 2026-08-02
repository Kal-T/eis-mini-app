package com.example.insurancecore.v1.controller;

import com.example.insurancecore.v1.service.AgencyV1Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/agencies")
public class AgencyV1Controller {

    private final AgencyV1Service agencyV1Service;

    public AgencyV1Controller(AgencyV1Service agencyV1Service) {
        this.agencyV1Service = agencyV1Service;
    }
}
