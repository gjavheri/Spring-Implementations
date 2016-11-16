package org.gsssoft.springrestful.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.gsssoft.springrestful.pojos.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	Map<Integer,Student> students= new HashMap<Integer, Student>();
	Random rn = new Random();
	
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable("id") Integer id){
		System.out.println("Student id request with id="+id);
		Student student=students.get(id);
		return student;
	}
	
	@PostMapping("/student")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		
	  Integer id= new Integer(rn.nextInt(200));	
	  students.put(id, student);	
	 student.setId(id.intValue());
	  return new ResponseEntity<Student>(student, HttpStatus.OK);	
		
	}
	
	
	
	
	

}
