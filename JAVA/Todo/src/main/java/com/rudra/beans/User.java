package com.rudra.beans;

public class User {

	private String firstname;
	private String lastname;

	

	public User(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public User() {
		this.firstname = "Vipan";
		this.lastname = "Kumar";
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
