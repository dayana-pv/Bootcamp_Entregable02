package com.dpv.entregable02.AccountMs.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BalanceRequest {
    private Double balance;
}
