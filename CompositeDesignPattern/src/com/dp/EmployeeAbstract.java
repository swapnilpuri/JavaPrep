package com.dp;

public abstract class EmployeeAbstract implements Employee {
	
	private String empId;
	private String empName;
	private String empRole;
	
	public EmployeeAbstract(String empId, String empName, String empRole) {
		this.empId = empId;
		this.empName = empName;
		this.empRole = empRole;
	}

	@Override
	public void printDetails() {
		System.out.println("Id:"+empId+"; Name:"+empName+"; Role:"+empRole);
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpRole() {
		return empRole;
	}

	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}

}
