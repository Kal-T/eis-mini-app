package com.example.insurancecore.v1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {
    private String customerId;
    private String name;
    private String email;
    private String phone;
    private String createdAt;
}
