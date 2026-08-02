package com.example.insurancecore.v1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AgencyDto {
    private String agencyId;
    private String name;
    private String code;
    private String createdAt;
}
