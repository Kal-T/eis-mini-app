package com.example.insurancecore.v1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuoteDto {
    private String quoteId;
    private String certificateNo;
    private String customerId;
    private Double premiumAmount;
    private String status;
    private Integer version;
    private String createdAt;
    private String updatedAt;
}
