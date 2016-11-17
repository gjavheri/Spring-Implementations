package org.gsssoft.springrestful.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.gsssoft.springrestful.dao.StudentDao;
import org.gsssoft.springrestful.dao.StudentDaoImpl;
import org.gsssoft.springrestful.pojos.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
	
	private static final Logger logger=LoggerFactory.getLogger(org.gsssoft.springrestful.controller.StudentController.class);
	
	Map<Integer,Student> students= new HashMap<Integer, Student>();
	Random rn = new Random();
	
	@Autowired
	private StudentDao studdao;
	
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable("id") Integer id){
		logger.info("Student id request with id="+id);
		Student student=students.get(id);
		return student;
	}
	
	@PostMapping("/student")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
	  logger.info("Add Student request has been received ");	
	  Integer id= new Integer(rn.nextInt(200));	
	//  students.put(id, student);	
	 student.setId(id.intValue());
	 studdao.addStudent(student);
	 logger.info("Adding Request has been done successfully");
	  return new ResponseEntity<Student>(student, HttpStatus.OK);	
		
	}
	
	
	
	
	

}
