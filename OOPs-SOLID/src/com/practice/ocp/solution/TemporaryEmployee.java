package com.practice.ocp.solution;

public class TemporaryEmployee extends Employee{

	public TemporaryEmployee(String name, double salary) {
		super(name, salary);
	}

	@Override
	void calculateBonus() {
		this.setBonus(this.getBonus()*0.05);
	}
}