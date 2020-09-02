package com.antilamer.batchantilamer.batch;

import com.antilamer.batchantilamer.model.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonRowMapper implements RowMapper<Person> {

    public static final String ID_COLUMN = "person_id";
    public static final String FIRST_NAME_COLUMN = "first_name";
    public static final String LAST_NAME_COLUMN = "last_name";

    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person = new Person();

        person.setId(rs.getBigDecimal(ID_COLUMN));
        person.setFirstName(rs.getString(FIRST_NAME_COLUMN));
        person.setLastName(rs.getString(LAST_NAME_COLUMN));

        return person;
    }
}