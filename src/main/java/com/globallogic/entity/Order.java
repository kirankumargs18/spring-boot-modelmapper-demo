package com.globallogic.entity;

public class Order {

	private String firstName;
	private String lastName;
	private String street;
	private String city;
	
	

	public Order() {
		super();
	}


	public Order(String firstName, String lastName, String street, String city) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.street = street;
		this.city = city;
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Order [firstName=" + firstName + ", lastName=" + lastName + ", street=" + street + ", city=" + city
				+ "]";
	}

}
