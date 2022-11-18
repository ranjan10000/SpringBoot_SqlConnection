package com.sql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sql.model.ModelClass;
import com.sql.repository.RepositoryClass;

@RestController
@RequestMapping("/api/")
public class ControllerClass {

	@Autowired
	RepositoryClass rc;

	@GetMapping(value = "testAPI1")
	public ResponseEntity<?> employeeInformation() {

		List<ModelClass> employee =rc.Read();

		return new ResponseEntity<>(employee, HttpStatus.OK);
	}
}
