package com.example.crud.controller;

import com.example.crud.model.Account;
import com.example.crud.service.AccountService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<Account> findAll() {
        return accountService.getAll();
    }

    @GetMapping("{id}")
    public Account getById(@PathVariable("id") Account account) {
        return account;
    }

    @PostMapping
    public Account create(@RequestBody Account account) {
        return accountService.save(account);
    }

    @PutMapping("{id}")
    public Account update(
            @PathVariable("id") Account accountFromDB,
            @RequestBody Account account
    ) {
        BeanUtils.copyProperties(account, accountFromDB, "id");
        return accountService.save(accountFromDB);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Account account) {
        accountService.delete(account);
    }
}
