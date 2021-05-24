package com.AddressBook_CSV_JSON;

import com.opencsv.bean.CsvBindByName;

public class Contacts {
	@CsvBindByName
	public String firstName;
	@CsvBindByName
	public String lastName;
	@CsvBindByName
	public Long phoneNumber;
	@CsvBindByName
	public String emailId;
	@CsvBindByName
	public String address;
	@CsvBindByName
	public int zipcode;
	@CsvBindByName
	public String city;
	@CsvBindByName
	public String state;


	
	public Contacts(String firstName, String lastName, Long phoneNumber, String emailId, String address,
			int zipcode, String city, String state) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.address = address;
		this.zipcode = zipcode;
		this.city = city;
		this.state = state;
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

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getZipCode() {
		return zipcode;
	}

	public void setZipCode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "AddressBook [firstname=" + firstName + ", lastname=" + lastName + ", phoneNumber=" + phoneNumber
				+ ", emailId=" + emailId + ", address=" + address + ", zipcode=" + zipcode + ", city=" + city
				+ ", state=" + state + "]";
	}

}