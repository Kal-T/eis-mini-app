package com.example.insurancecore.v2.repository;

import org.springframework.stereotype.Repository;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;

@Repository
public class AgencyV2Repository {

    private final DynamoDbEnhancedClient dynamoDbEnhancedClient;

    public AgencyV2Repository(DynamoDbEnhancedClient dynamoDbEnhancedClient) {
        this.dynamoDbEnhancedClient = dynamoDbEnhancedClient;
    }
}
