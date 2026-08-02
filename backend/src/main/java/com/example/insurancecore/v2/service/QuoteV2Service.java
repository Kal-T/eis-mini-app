package com.example.insurancecore.v2.service;

import com.example.insurancecore.v2.repository.QuoteV2Repository;
import org.springframework.stereotype.Service;

@Service
public class QuoteV2Service {

    private final QuoteV2Repository quoteV2Repository;

    public QuoteV2Service(QuoteV2Repository quoteV2Repository) {
        this.quoteV2Repository = quoteV2Repository;
    }
}
