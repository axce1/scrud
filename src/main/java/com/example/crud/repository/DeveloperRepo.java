package com.example.crud.repository;

import com.example.crud.model.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperRepo  extends JpaRepository<Developer, Long> {
}
