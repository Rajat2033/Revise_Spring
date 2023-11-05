package com.hexaware.springJdbc.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hexaware.springJdbc.DAO.IEmployeeDAO;
import com.hexaware.springJdbc.Entity.Employee;

@Service
public class EmployeeServiceImp implements IEmployeeService {

	@Autowired
	IEmployeeDAO dao;

	@Override
	public boolean insertQuery(Employee emp) {
		// TODO Auto-generated method stub
		return dao.insertQuery(emp);
	}

	@Override
	public boolean updateQuery(Employee emp) {
		// TODO Auto-generated method stub
		return dao.updateQuery(emp);
	}

	@Override
	public boolean deleteQuery(int id) {
		// TODO Auto-generated method stub
		return dao.deleteQuery(id);
	}

	@Override
	public Employee displayById(int id) {
		// TODO Auto-generated method stub
		return dao.displayById(id);
	}

	@Override
	public List<Employee> displayAllData() {
		// TODO Auto-generated method stub
		return dao.displayAllData();
	}
}
