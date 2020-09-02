package com.antilamer.batchantilamer.batch;

import com.antilamer.batchantilamer.model.Person;
import com.antilamer.batchantilamer.repository.PersonRepo;
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
        for (final Person person : items) {
            personRepo.save(person);
        }
    }
}
