package com.example.insurancecore.v1.repository;

import org.springframework.stereotype.Repository;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

@Repository
public class PolicyV1Repository {

    private final DynamoDbClient dynamoDbClient;

    public PolicyV1Repository(DynamoDbClient dynamoDbClient) {
        this.dynamoDbClient = dynamoDbClient;
    }
}
