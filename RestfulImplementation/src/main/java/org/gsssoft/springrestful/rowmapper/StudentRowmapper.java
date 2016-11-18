package org.gsssoft.springrestful.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.gsssoft.springrestful.pojos.Student;
import org.springframework.jdbc.core.RowMapper;

public class StudentRowmapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		Student stud=new Student();
		stud.setId(rs.getInt("id"));
		stud.setName(rs.getString("name"));
		return stud;
	}

}
