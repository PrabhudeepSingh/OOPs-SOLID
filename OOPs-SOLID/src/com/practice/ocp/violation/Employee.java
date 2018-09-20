package com.practice.ocp.violation;

public class Employee {
	
	private String name;
	private double salary;
	private double bonus;
	private String employeeType;
	
	public Employee(String name, double salary, String employeeType) {
		this.name = name;
		this.salary = salary;
		this.employeeType = employeeType;
	}
	
	public void calculateBonus() {
		if(this.employeeType.equals("Permanent"))
			this.bonus = this.salary*0.10;
		else
			if(this.employeeType.equals("Contract"))
				this.bonus = this.salary*0.05;
		
		//Note that here if we want to add any another type of employee
		//then we have to modify this class
		
	}
}