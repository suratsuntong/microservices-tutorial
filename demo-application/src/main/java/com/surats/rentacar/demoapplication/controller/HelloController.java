package com.surats.rentacar.demoapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.surats.rentacar.demoapplication.model.Student;
import com.surats.rentacar.demoapplication.services.StudentService;

@RestController
public class HelloController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/hello")
	public String greeting() {
		return "Hello Springboot!";
	}
	
	@PostMapping("/student")
	public Student save(@RequestBody Student student) {
		return studentService.save(student);
	}
	
	@GetMapping("/student")
	public ResponseEntity<Student> fetchStudent(@RequestParam int id) {
		Student student = studentService.fetchStudentById(id);
		if (student==null) {
			return ResponseEntity.notFound().build();
		}
		else {
			return ResponseEntity.ok().body(student);
		}
	}
}
