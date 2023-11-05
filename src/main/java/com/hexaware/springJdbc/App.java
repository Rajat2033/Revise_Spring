package com.hexaware.springJdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.springJdbc.Config.AppConfig;
import com.hexaware.springJdbc.Entity.Employee;
import com.hexaware.springJdbc.Service.EmployeeServiceImp;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);

		EmployeeServiceImp e = container.getBean(EmployeeServiceImp.class);

		System.out.println("Enter Details:");
		System.out.println("1.Insert");
		System.out.println("2.Update");
		System.out.println("3.Delete");
		System.out.println("4.Fetch By id");
		System.out.println("5.Fetch all data");
		System.out.println("6.Exit");
		int choice = Integer.parseInt(sc.nextLine());
		int eid;
		String ename;
		double salary;
		switch (choice) {
		case 1:
			System.out.println("Enter id");
			eid = Integer.parseInt(sc.nextLine());
			System.out.println("Enter Name");
			ename = sc.nextLine();
			System.out.println("Enter Salary");
			salary = Double.parseDouble(sc.nextLine());
			Employee emp = new Employee(eid, ename, salary);
			Boolean isCreated = e.insertQuery(emp);
			System.out.println("Data Inserted " + isCreated);
			break;
		case 2:
			System.out.println("Enter id you want to chnage");
			eid = Integer.parseInt(sc.nextLine());
			ename = sc.nextLine();
			System.out.println("Enter Salary");
			salary = Double.parseDouble(sc.nextLine());
			Employee emp1 = new Employee(eid, ename, salary);
			Boolean isUpdated = e.updateQuery(emp1);
			System.out.println("Data Updated " + isUpdated);
			break;
		case 3:
			System.out.println("Enter id to delete");
			eid = Integer.parseInt(sc.nextLine());

			Boolean isDeleted = e.deleteQuery(eid);
			System.out.println("Data deleted " + isDeleted);
			break;
		case 4:
			System.out.println("Enter id ");
			eid = Integer.parseInt(sc.nextLine());

			Employee list = e.displayById(eid);
			System.out.println("Data Fetched " + list);
			break;
		case 5:
			List<Employee> list1 = e.displayAllData();
			System.out.println("Data Fetched" + list1);
			break;
		case 6:
			System.out.println("Youve been logout");
			System.exit(choice);

		}

	}
}
