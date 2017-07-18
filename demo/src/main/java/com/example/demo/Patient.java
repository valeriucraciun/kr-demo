package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Patient {
	
	private Integer id;
	
	private String firstName;
	
	private String lastName;

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("first-name")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@JsonProperty("last-name")
	public String getLastName() {
		return lastName;
	}

	public Patient() {
		super();
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Patient(Integer id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	
}
