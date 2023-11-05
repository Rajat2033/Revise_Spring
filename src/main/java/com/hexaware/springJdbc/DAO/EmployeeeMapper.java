package com.hexaware.springJdbc.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hexaware.springJdbc.Entity.Employee;

public class EmployeeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e=new Employee();
		e.setEid(rs.getInt("id"));
		e.setName(rs.getString("name"));
		e.setSalary(rs.getDouble("salary"));
		return e;
	}

}
