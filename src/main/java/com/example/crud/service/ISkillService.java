package com.example.crud.service;

import com.example.crud.model.Skill;

import java.util.List;
import java.util.Optional;

public interface ISkillService {
    Optional<Skill> getById(Long id);

    Skill save(Skill skill);

    Skill update(Skill skill);

    void delete(Skill skill);

    List<Skill> getAll();
}
