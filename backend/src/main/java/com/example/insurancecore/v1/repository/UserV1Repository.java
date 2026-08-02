package com.example.insurancecore.v1.repository;

import org.springframework.stereotype.Repository;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

@Repository
public class UserV1Repository {

    private final DynamoDbClient dynamoDbClient;

    public UserV1Repository(DynamoDbClient dynamoDbClient) {
        this.dynamoDbClient = dynamoDbClient;
    }
}
