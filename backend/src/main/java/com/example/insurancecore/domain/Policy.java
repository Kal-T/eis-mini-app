package com.example.insurancecore.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSecondaryPartitionKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSecondarySortKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSortKey;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DynamoDbBean
public class Policy {
    private String pk;
    private String sk;
    private String gsi1pk;
    private String gsi1sk;
    private String gsi2pk;
    private String gsi2sk;

    private String policyId;
    private String certificateNo;
    private String customerId;
    private Double coverageAmount;
    private String status;
    private Integer latestVersion;
    private String createdAt;
    private String updatedAt;

    @DynamoDbPartitionKey
    @DynamoDbAttribute("PK")
    public String getPk() { return pk; }

    @DynamoDbSortKey
    @DynamoDbAttribute("SK")
    public String getSk() { return sk; }

    @DynamoDbSecondaryPartitionKey(indexNames = EntityConstants.GSI1_NAME)
    @DynamoDbAttribute("GSI1PK")
    public String getGsi1pk() { return gsi1pk; }

    @DynamoDbSecondarySortKey(indexNames = EntityConstants.GSI1_NAME)
    @DynamoDbAttribute("GSI1SK")
    public String getGsi1sk() { return gsi1sk; }

    @DynamoDbSecondaryPartitionKey(indexNames = EntityConstants.GSI2_NAME)
    @DynamoDbAttribute("GSI2PK")
    public String getGsi2pk() { return gsi2pk; }

    @DynamoDbSecondarySortKey(indexNames = EntityConstants.GSI2_NAME)
    @DynamoDbAttribute("GSI2SK")
    public String getGsi2sk() { return gsi2sk; }
}
