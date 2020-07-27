package com.example.crud.service;

public interface ISecurityService {
    String findLoggedInUsername();
    void autoLogin(String username, String password);
}
