package com.example.crud.service;

import com.example.crud.model.User;

public interface IUserService {
    void save(User user);
    User findByUsername(String username);
}
