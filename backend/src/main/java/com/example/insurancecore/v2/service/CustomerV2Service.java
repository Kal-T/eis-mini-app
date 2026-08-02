package com.example.insurancecore.v2.service;

import com.example.insurancecore.v2.repository.CustomerV2Repository;
import org.springframework.stereotype.Service;

@Service
public class CustomerV2Service {

    private final CustomerV2Repository customerV2Repository;

    public CustomerV2Service(CustomerV2Repository customerV2Repository) {
        this.customerV2Repository = customerV2Repository;
    }
}
