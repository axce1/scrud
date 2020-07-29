package com.example.crud.controller;

import com.example.crud.model.Developer;
import com.example.crud.service.DeveloperService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/developers")
public class DeveloperController {

    private final DeveloperService developerService;

    @Autowired
    public DeveloperController(DeveloperService developerService) {
        this.developerService = developerService;
    }

    @GetMapping
    public List<Developer> findAll() {
        return developerService.getAll();
    }

    @GetMapping("{id}")
    public Developer getById(@PathVariable("id") Developer developer) {
        return developer;
    }

    @PostMapping
    public Developer create(@RequestBody Developer developer) {
        return developerService.save(developer);
    }

    @PutMapping("{id}")
    public Developer update(
            @PathVariable("id") Developer developerFromDB,
            @RequestBody Developer developer
    ) {
        BeanUtils.copyProperties(developer, developerFromDB, "id");
        return developerService.save(developerFromDB);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Developer developer) {
        developerService.delete(developer);
    }
}
