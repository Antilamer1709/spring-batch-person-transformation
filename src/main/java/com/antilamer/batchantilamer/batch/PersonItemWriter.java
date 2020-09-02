package com.antilamer.batchantilamer.batch;

import com.antilamer.batchantilamer.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class PersonItemWriter implements ItemWriter<Person> {

    private static final Logger log = LoggerFactory.getLogger(PersonItemWriter.class);

    private final JdbcTemplate jdbcTemplate;

    public PersonItemWriter(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void write(List<? extends Person> items) {
        for (final Person person : items) {
//            log.info("Written <" + person + "> to the database.");
            String SQL = "UPDATE people SET first_name = ?, last_name = ? WHERE person_id = ?";
            jdbcTemplate.update(SQL, person.getFirstName(), person.getLastName(), person.getId());
        }
    }
}
