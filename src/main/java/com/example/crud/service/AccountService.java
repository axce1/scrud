package com.example.crud.service;

import com.example.crud.model.Account;
import com.example.crud.repository.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService implements IAccountService {

    private final AccountRepo accountRepo;

    @Autowired
    public AccountService(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }

    @Override
    public Optional<Account> getById(Long id) {
        return accountRepo.findById(id);
    }

    @Override
    public Account save(Account account) {
        return accountRepo.save(account);
    }

    @Override
    public Account update(Account account) {
        return accountRepo.save(account);
    }

    @Override
    public void delete(Account account) {
        accountRepo.delete(account);
    }

    @Override
    public List<Account> getAll() {
        return accountRepo.findAll();
    }
}
