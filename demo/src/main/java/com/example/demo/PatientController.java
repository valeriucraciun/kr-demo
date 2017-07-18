package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

	private static List<Patient> patients = new ArrayList<>();
	static {
		patients.add(new Patient(1, "Grigore", "Ioan"));
		patients.add(new Patient(2, "Ionescu", "Alexandru"));
		patients.add(new Patient(2, "Munteanu", "Maria"));
		patients.add(new Patient(3, "Vasilescu", null));
	}

	@RequestMapping(value = "/patient/read", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<Patient> getPatient(@RequestParam(value = "id") Integer id) {
		return ResponseEntity.ok().body(searchById(id));
	}
	
	@RequestMapping(value = "/patient/list", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<Patient>> listPatients() {
		return ResponseEntity.ok().body(patients);
	}

	@RequestMapping(value = "/patient/save", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	public ResponseEntity<Patient> savePatient(@RequestBody Patient patient) {
		if (patient.getId() == null) {
			return ResponseEntity.badRequest().body(null);
		}

		try {
			if (searchById(patient.getId()) != null) {
				return ResponseEntity.badRequest().body(null);
			}
			patients.add(patient);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
		return ResponseEntity.ok().body(patient);
	}

	private Patient searchById(Integer id) {
		for (Patient patient : patients) {
			if (patient.getId().equals(id)) {
				return patient;
			}
		}
		return null;
	}
}
