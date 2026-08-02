package com.example.insurancecore.v2.repository;

import org.springframework.stereotype.Repository;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;

@Repository
public class QuoteV2Repository {

    private final DynamoDbEnhancedClient dynamoDbEnhancedClient;

    public QuoteV2Repository(DynamoDbEnhancedClient dynamoDbEnhancedClient) {
        this.dynamoDbEnhancedClient = dynamoDbEnhancedClient;
    }
}
