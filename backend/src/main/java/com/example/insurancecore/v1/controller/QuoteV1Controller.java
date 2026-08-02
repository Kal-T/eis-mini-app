package com.example.insurancecore.v1.controller;

import com.example.insurancecore.v1.service.QuoteV1Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/quotes")
public class QuoteV1Controller {

    private final QuoteV1Service quoteV1Service;

    public QuoteV1Controller(QuoteV1Service quoteV1Service) {
        this.quoteV1Service = quoteV1Service;
    }
}
