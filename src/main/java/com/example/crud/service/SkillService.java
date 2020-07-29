package com.example.crud.service;

import com.example.crud.model.Skill;
import com.example.crud.repository.SkillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillService implements ISkillService {

    private final SkillRepo skillRepo;

    @Autowired
    public SkillService(SkillRepo skillRepo) {
        this.skillRepo = skillRepo;
    }

    @Override
    public Optional<Skill> getById(Long id) {
        return skillRepo.findById(id);
    }

    @Override
    public Skill save(Skill skill) {
        return skillRepo.save(skill);
    }

    @Override
    public Skill update(Skill skill) {
        return skillRepo.save(skill);
    }

    @Override
    public void delete(Skill skill) {
        skillRepo.delete(skill);
    }

    @Override
    public List<Skill> getAll() {
        return skillRepo.findAll();
    }
}
