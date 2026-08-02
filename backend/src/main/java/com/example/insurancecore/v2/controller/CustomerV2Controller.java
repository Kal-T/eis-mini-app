package com.example.insurancecore.v2.controller;

import com.example.insurancecore.v2.service.CustomerV2Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/customers")
public class CustomerV2Controller {

    private final CustomerV2Service customerV2Service;

    public CustomerV2Controller(CustomerV2Service customerV2Service) {
        this.customerV2Service = customerV2Service;
    }
}
