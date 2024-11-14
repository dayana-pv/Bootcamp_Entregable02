package com.dpv.entregable02.CustomerMs.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CustomerRequest {
    private String name;
    private String lastName;
    private String dni;
    private String email;
}
