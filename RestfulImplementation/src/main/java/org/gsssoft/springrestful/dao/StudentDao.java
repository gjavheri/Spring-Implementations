package org.gsssoft.springrestful.dao;

import java.util.Map;

import org.gsssoft.springrestful.pojos.Student;

public interface StudentDao {
	
	Map<String,String> getAllStudents();
	Student getStudent(int id);
	void addStudent(Student stud);
	void updateStudent(Student stud);
	void deleteStudent(int id);
	
	

}
