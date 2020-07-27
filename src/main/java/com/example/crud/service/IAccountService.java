package com.example.crud.service;

import com.example.crud.model.Account;

import java.util.List;
import java.util.Optional;

public interface IAccountService {

    Optional<Account> getById(Long id);

    Account save(Account account);

    Account update(Account account);

    void delete(Account account);

    List<Account> getAll();

}
