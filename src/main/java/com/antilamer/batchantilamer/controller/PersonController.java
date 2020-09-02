package com.antilamer.batchantilamer.controller;

import com.antilamer.batchantilamer.model.Person;
import com.antilamer.batchantilamer.repository.PersonRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {

    private final PersonRepo personRepo;

    public PersonController(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }


    @GetMapping
    public List<Person> getAllPersons() {
        return personRepo.findAll();
    }
}
