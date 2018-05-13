package edu.FinalPro;

public class Employee  extends Person{

	
	private int salary;

	public Employee(String name, int age, int salary) {
		super(name, age);
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {

		return super.toString()+ "\nsalary: " + this.salary;

	}
}
