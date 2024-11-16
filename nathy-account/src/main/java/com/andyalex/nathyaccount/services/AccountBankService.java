package com.andyalex.nathyaccount.services;

import com.andyalex.nathyaccount.entity.AccountBank;
import com.andyalex.nathyaccount.repository.AccountBankRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountBankService {

    private AccountBankRepository accountBankRepository;

    public AccountBankService(AccountBankRepository accountBankRepository) {
        this.accountBankRepository = accountBankRepository;
    }

    public List<AccountBank> findAll() {
        return (List<AccountBank>) this.accountBankRepository.findAll();
    }

    public AccountBank findByAccountBank(Long id) {
        return this.accountBankRepository.findById(id).orElse(null);
    }

    public void saveAll(List<AccountBank> accountBanks) {
        this.accountBankRepository.saveAll(accountBanks);
    }
}
