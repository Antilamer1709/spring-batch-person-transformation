package com.antilamer.spring.batch.person.transformation.model;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "people", schema = "PUBLIC")
public class Person {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "person_id")
	private BigDecimal id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	public Person() {
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Person(BigDecimal id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", firstName: " + firstName + ", lastName: " + lastName;
	}
}
