package com.titouan.bankapp.domain.repository;

import com.titouan.bankapp.domain.model.Account;

import java.util.List;
import java.util.Optional;

public interface AccountRepository {
    Optional<Account> findById(Long id);
    List<Account> findAll();
    void save(Account account);
}
