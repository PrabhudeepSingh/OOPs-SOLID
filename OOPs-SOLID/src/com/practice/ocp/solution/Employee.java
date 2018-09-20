package com.practice.ocp.solution;

public abstract class Employee {
	
	private String name;
	private double salary;
	private double bonus;
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	abstract void calculateBonus();
	//Now this class is open for extension
	//but closed for modification.

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
}