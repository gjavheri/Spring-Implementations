package org.gsssoft.springrestful.dao;

import java.util.Map;

import javax.sql.DataSource;

import org.gsssoft.springrestful.pojos.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	private JdbcTemplate jdbctemp;
	DataSource datasource;
	
	public void setDatasource(DataSource datasource){
	 jdbctemp=new JdbcTemplate(datasource);	
	 	
	}

	public Map<String, String> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addStudent(Student stud) {
		// TODO Auto-generated method stub
		StringBuilder insertsql=new StringBuilder();
		insertsql.append("insert into student (id,name) values(")
		.append(stud.getId()).append(",'").append(stud.getName()).append("')");
		jdbctemp.update(insertsql.toString());

	}

	public void updateStudent(Student stud) {
		// TODO Auto-generated method stub

	}

	public void deleteStudent(int id) {
		// TODO Auto-generated method stub

	}

}
