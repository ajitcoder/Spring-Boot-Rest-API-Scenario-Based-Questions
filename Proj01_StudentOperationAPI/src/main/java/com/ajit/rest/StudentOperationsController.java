package com.ajit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajit.model.Student;

@RestController
@RequestMapping("/api/student")
public class StudentOperationsController {

	@PostMapping("/save")
	public ResponseEntity<String> registerStudent(@RequestBody Student student){
		
		System.out.println("Model:: "+student);
	
		return new ResponseEntity<String>("Student Saved Successfully",HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable Integer id){
		
		Student student = new Student(1001, "Ajit", "Java", 25, "ajit@gmail.com");
		
		if(id.equals(student.getId())) {
			
			return new ResponseEntity<Student>(student, HttpStatus.OK);
		
		}else {
			
			Student stud = new Student();
			
			return new ResponseEntity<Student>(stud, HttpStatus.OK);
		}
	}
}