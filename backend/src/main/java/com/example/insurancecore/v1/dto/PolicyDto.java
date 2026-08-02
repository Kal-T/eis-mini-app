package com.example.insurancecore.v1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PolicyDto {
    private String policyId;
    private String certificateNo;
    private String customerId;
    private Double coverageAmount;
    private String status;
    private Integer version;
    private String createdAt;
    private String updatedAt;
}
