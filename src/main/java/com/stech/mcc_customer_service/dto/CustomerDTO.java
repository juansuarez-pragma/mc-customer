package com.stech.mcc_customer_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

    private String id;
    private String cu;
    private String name;
    private String address;
    private String email;
    private String mobile;
}
