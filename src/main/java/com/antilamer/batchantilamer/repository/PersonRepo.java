package com.antilamer.batchantilamer.repository;

import com.antilamer.batchantilamer.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface PersonRepo extends JpaRepository<Person, BigDecimal> {

}
