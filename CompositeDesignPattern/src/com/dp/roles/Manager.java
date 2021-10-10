package com.dp.roles;

import java.util.ArrayList;
import java.util.List;

import com.dp.Employee;
import com.dp.EmployeeAbstract;

public class Manager extends EmployeeAbstract {
	List<Employee> subordinates;
	
	public Manager(String empId, String empName, String empRole) {
		super(empId, empName, empRole);
		subordinates = new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee subordinate) {
		subordinates.add(subordinate);
	}
	
	@Override
	public void printDetails() {
		super.printDetails();
		subordinates.forEach(Employee::printDetails);
	}	

}
