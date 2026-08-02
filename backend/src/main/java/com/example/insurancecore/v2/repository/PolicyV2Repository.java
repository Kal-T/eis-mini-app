package com.example.insurancecore.v2.repository;

import org.springframework.stereotype.Repository;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;

@Repository
public class PolicyV2Repository {

    private final DynamoDbEnhancedClient dynamoDbEnhancedClient;

    public PolicyV2Repository(DynamoDbEnhancedClient dynamoDbEnhancedClient) {
        this.dynamoDbEnhancedClient = dynamoDbEnhancedClient;
    }
}
