package com.practice.ocp.solution;

public class PermanentEmployee extends Employee
{

	public PermanentEmployee(String name, double salary) {
		super(name, salary);
	}

	@Override
	void calculateBonus() {
		this.setBonus(this.getBonus()*0.10);
	}

}