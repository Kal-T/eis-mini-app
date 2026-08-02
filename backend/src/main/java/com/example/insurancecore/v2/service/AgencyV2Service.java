package com.example.insurancecore.v2.service;

import com.example.insurancecore.v2.repository.AgencyV2Repository;
import org.springframework.stereotype.Service;

@Service
public class AgencyV2Service {

    private final AgencyV2Repository agencyV2Repository;

    public AgencyV2Service(AgencyV2Repository agencyV2Repository) {
        this.agencyV2Repository = agencyV2Repository;
    }
}
