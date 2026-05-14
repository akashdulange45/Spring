package in.ad.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.sp.beans.Student;

public class StudentRowMapper implements RowMapper<Student>{
	
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setRollno(rs.getInt("stdroll"));
		student.setName(rs.getString("stdname"));
		student.setMarks(rs.getString("stdmarks"));
		
		return student;
	}

}
