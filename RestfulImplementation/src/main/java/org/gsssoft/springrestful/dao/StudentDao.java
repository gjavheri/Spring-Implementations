package org.gsssoft.springrestful.dao;

import java.util.List;
import java.util.Map;

import org.gsssoft.springrestful.pojos.Student;
import org.springframework.http.ResponseEntity;

public interface StudentDao {
	
	List<Student> getAllStudents();
	Student getStudent(int id);
	void addStudent(Student stud);
	ResponseEntity<Student> updateStudent(Student stud);
	ResponseEntity<Integer> deleteStudent(int id);
	
	

}
