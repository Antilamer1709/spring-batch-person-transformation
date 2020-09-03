package com.antilamer.spring.batch.person.transformation.batch;

import com.antilamer.spring.batch.person.transformation.model.Person;
import com.antilamer.spring.batch.person.transformation.repository.PersonRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class PersonItemWriter implements ItemWriter<Person> {

    private static final Logger log = LoggerFactory.getLogger(PersonItemWriter.class);

    private final PersonRepo personRepo;

    public PersonItemWriter(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }


    public void write(List<? extends Person> items) {
        personRepo.saveAll(items);
    }
}
