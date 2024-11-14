package com.dpv.entregable02.AccountMs.controllers;

import com.dpv.entregable02.AccountMs.domain.Account;
import com.dpv.entregable02.AccountMs.dto.AccountRequest;
import com.dpv.entregable02.AccountMs.dto.BalanceRequest;
import com.dpv.entregable02.AccountMs.services.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    private final AccountService accountService;

    @PostMapping()
    public Account registerAccount(@RequestBody AccountRequest accountRequest) {
        return accountService.saveAccount(accountRequest);
    }

    @GetMapping()
    public List<Account> listAccounts() {
        return accountService.listAccounts();
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable Long id) {
        return accountService.getAccountById(id);
    }

    @PutMapping("/{id}/deposit")
    public Account depositBalance(@PathVariable Long id, @RequestBody BalanceRequest balanceRequest) {
        return accountService.depositBalance(id, balanceRequest);
    }

    @PutMapping("/{id}/remove")
    public Account removeBalance(@PathVariable Long id, @RequestBody BalanceRequest balanceRequest) {
        return accountService.removeBalance(id, balanceRequest);
    }

    @DeleteMapping("/{id}")
    public boolean deleteAccount(@PathVariable Long id) {
        return accountService.deleteAccount(id);
    }
}