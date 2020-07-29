package com.example.crud.service;

import com.example.crud.model.Developer;

import java.util.List;
import java.util.Optional;

public interface IDeveloperService {
    Optional<Developer> getById(Long id);

    Developer save(Developer developer);

    Developer update(Developer developer);

    void delete(Developer developer);

    List<Developer> getAll();
}
