package com.example.demo;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Test2 {

	private static final String BASE_URL = "http://localhost:8212/";
	
	@Test
	public void test() {

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);

		RestTemplate restTemplate = new RestTemplate();

		HttpEntity<String> request = new HttpEntity<>(headers);
		ResponseEntity<Patient> response = restTemplate.exchange(BASE_URL + "patient/read?id=1",
				HttpMethod.GET, request, Patient.class);

		Patient patient = (Patient)response.getBody();
		System.out.println(patient.getFirstName() + " " + patient.getLastName());
	}
}
