package com.antilamer.spring.batch.person.transformation.repository;

import com.antilamer.spring.batch.person.transformation.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface PersonRepo extends JpaRepository<Person, BigDecimal> {

}
