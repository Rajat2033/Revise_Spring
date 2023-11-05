package com.hexaware.springJdbc.Service;

import java.util.List;

import com.hexaware.springJdbc.Entity.Employee;

public interface IEmployeeService {
	
	public boolean insertQuery(Employee emp);

	public boolean updateQuery(Employee emp);

	public boolean deleteQuery(int id);

	public Employee displayById(int id);

	public List<Employee> displayAllData();

}
