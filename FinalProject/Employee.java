package FinalProject;

public class Employee extends Person {

	private int salary;

	public Employee(String name, int age, int salary, Address address) {
		super(name, age, address);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSalary: " + salary;
	}

}

