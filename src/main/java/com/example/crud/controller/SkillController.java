package com.example.crud.controller;

import com.example.crud.model.Skill;
import com.example.crud.service.SkillService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillController {

    private final SkillService skillService;

    @Autowired
    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping
    public List<Skill> findAll() {
        return skillService.getAll();
    }

    @GetMapping("{id}")
    public Skill getById(@PathVariable("id") Skill skill) {
        return skill;
    }

    @PostMapping
    public Skill create(@RequestBody Skill skill) {
        return skillService.save(skill);
    }

    @PutMapping("{id}")
    public Skill update(
            @PathVariable("id") Skill skillFromDB,
            @RequestBody Skill skill
    ) {
        BeanUtils.copyProperties(skill, skillFromDB, "id");
        return skillService.save(skillFromDB);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Skill skill) {
        skillService.delete(skill);
    }
}
