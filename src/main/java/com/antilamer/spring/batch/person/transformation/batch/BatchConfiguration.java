package com.antilamer.spring.batch.person.transformation.batch;

import com.antilamer.spring.batch.person.transformation.model.Person;
import com.antilamer.spring.batch.person.transformation.repository.PersonRepo;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.builder.JdbcCursorItemReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class BatchConfiguration {

	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	@Autowired
    public DataSource dataSource;

	@Bean
	public JdbcCursorItemReader<Person> reader() {
		return new JdbcCursorItemReaderBuilder<Person>()
				.dataSource(dataSource)
				.name("personItemReader")
				.sql("select person_id, first_name, last_name from people")
				.rowMapper(new PersonRowMapper())
				.build();

	}

	@Bean
	public PersonItemProcessor processor() {
		return new PersonItemProcessor();
	}

	@Bean
	public PersonItemWriter writer(PersonRepo personRepo) {
		return new PersonItemWriter(personRepo);
	}

	@Bean
	public Job importUserJob(JobCompletionNotificationListener listener, Step step1) {
		return jobBuilderFactory.get("importUserJob")
			.incrementer(new RunIdIncrementer())
			.listener(listener)
			.flow(step1)
			.end()
			.build();
	}

	@Bean
	public Step step1(PersonItemWriter writer) {
		return stepBuilderFactory.get("step1")
			.<Person, Person> chunk(1000)
			.reader(reader())
			.processor(processor())
			.writer(writer)
			.build();
	}

}
