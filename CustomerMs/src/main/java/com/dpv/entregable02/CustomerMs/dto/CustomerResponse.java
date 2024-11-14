package com.dpv.entregable02.CustomerMs.dto;

import lombok.Builder;

@Builder
public class CustomerResponse {
    private Long id;
    private String name;
    private String lastName;
    private String dni;
    private String email;
}
