package edu.FinalPro;

public class Person {
	
	private String name;
	private int age;
	private Address address;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.setName(name);
		this.age = age;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (100<age&&0<age)
		this.age = age;

	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		
		return this.name+":\nage: "+ this.getAge()
		+"\naddress: "+this.getAddress().getCity()+", "+this.getAddress().getStreetName()+", "+this.getAddress().getHouseNumber()+".";
	}
	

	

}
