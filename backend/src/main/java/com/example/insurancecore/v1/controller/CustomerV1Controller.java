package com.example.insurancecore.v1.controller;

import com.example.insurancecore.v1.service.CustomerV1Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerV1Controller {

    private final CustomerV1Service customerV1Service;

    public CustomerV1Controller(CustomerV1Service customerV1Service) {
        this.customerV1Service = customerV1Service;
    }
}
