package com.example.insurancecore.v1.service;

import com.example.insurancecore.v1.repository.AgencyV1Repository;
import org.springframework.stereotype.Service;

@Service
public class AgencyV1Service {

    private final AgencyV1Repository agencyV1Repository;

    public AgencyV1Service(AgencyV1Repository agencyV1Repository) {
        this.agencyV1Repository = agencyV1Repository;
    }
}
