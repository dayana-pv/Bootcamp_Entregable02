package com.dpv.entregable02.AccountMs.dto;

import com.dpv.entregable02.AccountMs.domain.AccountType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AccountRequest {
    private AccountType accountType;
    private Long customerId;
}
