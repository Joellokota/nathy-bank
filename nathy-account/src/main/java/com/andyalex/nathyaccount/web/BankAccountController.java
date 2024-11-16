package com.andyalex.nathyaccount.web;

import com.andyalex.nathyaccount.entity.AccountBank;
import com.andyalex.nathyaccount.services.AccountBankService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class BankAccountController {

    private AccountBankService accountBankService;

    public BankAccountController(AccountBankService accountBankService) {
        this.accountBankService = accountBankService;
    }

    @GetMapping("list-accounts")
    public List<AccountBank> listBankAccounts() {

        List<AccountBank> bankAccounts = this.accountBankService.findAll();
        return bankAccounts;
    }
    @GetMapping("list-accounts/{id}")
    public AccountBank getBankAccountById(Long id) {
        return this.accountBankService.findByAccountBank(id);
    }
}
