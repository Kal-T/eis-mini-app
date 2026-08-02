package com.example.insurancecore.v2.controller;

import com.example.insurancecore.v2.service.AgencyV2Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/agencies")
public class AgencyV2Controller {

    private final AgencyV2Service agencyV2Service;

    public AgencyV2Controller(AgencyV2Service agencyV2Service) {
        this.agencyV2Service = agencyV2Service;
    }
}
