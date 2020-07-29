package com.example.crud.service;

import com.example.crud.model.Developer;
import com.example.crud.repository.DeveloperRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeveloperService implements IDeveloperService {

    private final DeveloperRepo developerRepo;

    @Autowired
    public DeveloperService(DeveloperRepo developerRepo) {
        this.developerRepo = developerRepo;
    }

    @Override
    public Optional<Developer> getById(Long id) {
        return developerRepo.findById(id);
    }

    @Override
    public Developer save(Developer developer) {
        return developerRepo.save(developer);
    }

    @Override
    public Developer update(Developer developer) {
        return developerRepo.save(developer);
    }

    @Override
    public void delete(Developer developer) {
        developerRepo.delete(developer);
    }

    @Override
    public List<Developer> getAll() {
        return developerRepo.findAll();
    }
}