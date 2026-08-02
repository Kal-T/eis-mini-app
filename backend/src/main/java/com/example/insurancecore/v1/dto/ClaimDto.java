package com.example.insurancecore.v1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClaimDto {
    private String claimId;
    private String policyId;
    private Double claimAmount;
    private String status;
    private Integer version;
    private String createdAt;
    private String updatedAt;
}
