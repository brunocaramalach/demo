package com.example.demo.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skills")
public class SkillController {

    @GetMapping
    public ResponseEntity<Object> getAllSkills(){
        return ResponseEntity.status(HttpStatus.OK).body( "//GET");
    }  
    
    @PostMapping
    public ResponseEntity<Object> saveSkill(){
        return ResponseEntity.status(HttpStatus.OK).body( "//POST");

    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateSkill(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body( "//PUT id:" + id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteSkill(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body( "//DELETE id:" + id);
    }
}
