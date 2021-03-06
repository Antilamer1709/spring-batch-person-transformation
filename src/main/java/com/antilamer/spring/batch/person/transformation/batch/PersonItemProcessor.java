package com.antilamer.spring.batch.person.transformation.batch;

import com.antilamer.spring.batch.person.transformation.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

	private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

	@Override
	public Person process(final Person person) {
		final String firstName = person.getFirstName().toUpperCase();
		final String lastName = person.getLastName().toUpperCase();

		person.setFirstName(firstName);
		person.setLastName(lastName);

		return person;
	}

}
