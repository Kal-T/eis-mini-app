package com.example.insurancecore.v1.repository;

import org.springframework.stereotype.Repository;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

@Repository
public class QuoteV1Repository {

    private final DynamoDbClient dynamoDbClient;

    public QuoteV1Repository(DynamoDbClient dynamoDbClient) {
        this.dynamoDbClient = dynamoDbClient;
    }
}
