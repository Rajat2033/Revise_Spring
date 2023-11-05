package com.hexaware.springJdbc.DAO;

import java.util.List;

import com.hexaware.springJdbc.Entity.Employee;

public interface IEmployeeDAO {
	public boolean insertQuery(Employee emp);
	
	public boolean updateQuery(Employee emp);
	
	public boolean deleteQuery(int id);
	
	public Employee displayById(int id); 
	
	public List<Employee> displayAllData();
	
}
