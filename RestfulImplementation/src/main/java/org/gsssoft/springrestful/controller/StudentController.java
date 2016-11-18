package org.gsssoft.springrestful.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.gsssoft.springrestful.dao.StudentDao;
import org.gsssoft.springrestful.pojos.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		return studdao.getStudent(id);
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
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studdao.getAllStudents();
		
	}
	
	@PutMapping("/student")
	public ResponseEntity<Student> updateStudent(@RequestBody Student stud){
		studdao.updateStudent(stud);
		return new ResponseEntity<Student>(stud,HttpStatus.OK);
		
		
	}
	
	@DeleteMapping("/student/{id}")
	public ResponseEntity<Integer> deleteStudent(@PathVariable("id") int id){
		
	 studdao.deleteStudent(id);	
	 return new ResponseEntity<Integer>(id,HttpStatus.OK);	
	}
	
	
	

}
