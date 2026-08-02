package com.example.insurancecore.v2.controller;

import com.example.insurancecore.v2.service.QuoteV2Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/quotes")
public class QuoteV2Controller {

    private final QuoteV2Service quoteV2Service;

    public QuoteV2Controller(QuoteV2Service quoteV2Service) {
        this.quoteV2Service = quoteV2Service;
    }
}
