package com.hexaware.springJdbc.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.hexaware.springJdbc.Entity.Employee;

@Repository
public class EmployeeDao implements IEmployeeDAO {

	JdbcTemplate template;

	@Autowired
	public EmployeeDao(DataSource datasource) {
		super();
		template = new JdbcTemplate(datasource);

	}

	@Override
	public boolean insertQuery(Employee emp) {
		String insert = "insert into employees(id,name,salary) values(?,?,?)";

		int count = template.update(insert, emp.getEid(), emp.getName(), emp.getSalary());

		return count > 0;
	}

	@Override
	public boolean updateQuery(Employee emp) {
		String update = "update employees set name=? where id=?";

		int count = template.update(update, emp.getName(), emp.getEid());

		return count > 0;
	}

	@Override
	public boolean deleteQuery(int id) {
		String delete = "delete from employees where id=?";

		int count = template.update(delete, id);

		return count > 0;
	}

	@Override
	public Employee displayById(int id) {
		String displayById = "select id,name,salary from employees where id=?";

		Employee e = template.queryForObject(displayById, new EmployeeeMapper(), id);
		return e;
	}

	@Override
	public List<Employee> displayAllData() {
		String displayData = "select * from employees";

		List<Employee> e = template.query(displayData, new EmployeeeMapper());

		return e;
	}
}
