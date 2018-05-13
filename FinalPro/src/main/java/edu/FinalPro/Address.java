package edu.FinalPro;

public class Address {
	private String streetName;
	private String houseNumber;
	private String city;

	public Address() {
		super();
	}

	public Address(String city, String streetName , String houseNumber) {
		super();
	
		this.setCity(city);
	this.setStreetName(streetName);
	this.setHouseNumber(houseNumber);
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	

}
