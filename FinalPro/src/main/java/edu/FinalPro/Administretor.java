package edu.FinalPro;

public class Administretor extends Person {

	private String UserName;
	private String Password;

	public Administretor() {
		super();
	}

	public Administretor(String name, int age, String userName, String password) {
		super(name, age);
		UserName = userName;
		Password = password;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		this.UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		this.Password = password;
	}

}
