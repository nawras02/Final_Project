package edu.FinalPro;

public class Student extends Person{

	private int grade;

	public Student() {
		super();
	}

	public Student(String name, int age, int grade) {
		super(name, age);

		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {

		return super.toString() + "\ngrade: " + this.grade;

	}
}
