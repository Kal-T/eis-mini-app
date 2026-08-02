package com.example.insurancecore.v1.service;

import com.example.insurancecore.v1.repository.QuoteV1Repository;
import org.springframework.stereotype.Service;

@Service
public class QuoteV1Service {

    private final QuoteV1Repository quoteV1Repository;

    public QuoteV1Service(QuoteV1Repository quoteV1Repository) {
        this.quoteV1Repository = quoteV1Repository;
    }
}
