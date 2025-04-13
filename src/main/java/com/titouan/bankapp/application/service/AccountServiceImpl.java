package com.titouan.bankapp.application.service;


import com.titouan.bankapp.domain.repository.AccountRepository;
import com.titouan.bankapp.domain.model.Account;

import java.util.List;

public class AccountServiceImpl {

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account getAccountById(Long id) {
        return accountRepository.findById(id).orElse(null);
    }

    public List<Account> getAllAccount() {
        return accountRepository.findAll();
    }

    public void createUser(Account account) {
        accountRepository.save(account);
    }
}
