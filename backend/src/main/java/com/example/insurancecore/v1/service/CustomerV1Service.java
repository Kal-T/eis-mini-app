package com.example.insurancecore.v1.service;

import com.example.insurancecore.v1.repository.CustomerV1Repository;
import org.springframework.stereotype.Service;

@Service
public class CustomerV1Service {

    private final CustomerV1Repository customerV1Repository;

    public CustomerV1Service(CustomerV1Repository customerV1Repository) {
        this.customerV1Repository = customerV1Repository;
    }
}
