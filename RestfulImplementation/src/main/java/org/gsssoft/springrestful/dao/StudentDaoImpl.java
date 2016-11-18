package org.gsssoft.springrestful.dao;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.gsssoft.springrestful.pojos.Student;
import org.gsssoft.springrestful.rowmapper.StudentRowmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	private JdbcTemplate jdbctemp;
	DataSource datasource;
	
	public void setDatasource(DataSource datasource){
	 jdbctemp=new JdbcTemplate(datasource);	
	 	
	}

	
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		StringBuilder sql=new StringBuilder("select * from student where id=");
		sql.append(id);
		return jdbctemp.query(sql.toString(),new StudentRowmapper()).get(0);
		
	}

	public void addStudent(Student stud) {
		// TODO Auto-generated method stub
		StringBuilder insertsql=new StringBuilder();
		insertsql.append("insert into student (id,name) values(")
		.append(stud.getId()).append(",'").append(stud.getName()).append("')");
		jdbctemp.update(insertsql.toString());

	}
	
	public List<Student> getAllStudents(){
		String sql= "select * from student";
		return jdbctemp.query(sql,new StudentRowmapper());
		
	}

	public ResponseEntity<Student> updateStudent(Student stud) {
		// TODO Auto-generated method stub
		String sql="update student set name=? where id=?";
		jdbctemp.update(sql, stud.getName(),stud.getId());
		return new ResponseEntity<Student>(stud, HttpStatus.OK);
		

	}

	@DeleteMapping("/student/{id}")
	public ResponseEntity<Integer> deleteStudent(int id) {
		// TODO Auto-generated method stub
		String sql="delete  from student where id=?";
		jdbctemp.update(sql, id);
		return new ResponseEntity<Integer>(id, HttpStatus.OK);
		

	}

}
