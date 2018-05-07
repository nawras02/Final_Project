package FinalProject;

public class Student extends Person {

	private int grade;

	public Student(String name, int age, int grade, Address address) {
		super(name, age, address);
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
		return super.toString() + "\nGrade is: " + grade;
	}
}
