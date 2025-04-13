package com.titouan.bankapp.application.service;

import com.titouan.bankapp.domain.model.Account;

import java.util.List;

public interface AccountService {

        Account getAccountById(Long id);
        List<Account> getAllAccount();
        void createAccount(Account user);


}
