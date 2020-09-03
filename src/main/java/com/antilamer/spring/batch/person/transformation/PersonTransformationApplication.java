package com.antilamer.spring.batch.person.transformation;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class PersonTransformationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonTransformationApplication.class, args);
	}

}
