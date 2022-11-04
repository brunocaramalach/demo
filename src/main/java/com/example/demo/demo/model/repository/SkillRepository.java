package com.example.demo.demo.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.demo.model.entities.Skill;

public interface SkillRepository extends CrudRepository<Skill, Integer> {
    
}
