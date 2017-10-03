package com.mybank.domain;

public class Customer {
	
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("[%s %s]", this.getFirstName(), this.getLastName());
	}

/**
 * First name of Customer.
 */
private String firstName;

/**
 * Last name of Customer.
 */
private String lastName;

/**
 * Account of Customer.
 */
private Account account;

/**
 * Constructor of Customer.
 */
public Customer(String fName, String lName) {
	this.firstName = fName;
	this.lastName = lName;
	this.account = new Account();
}

/**
 * Getter for the First name of Customer.
 * @return first name
 */
public String getFirstName() {
	return firstName;
}

/**
 * Getter for the Last name of Customer.
 * 
 * @return last name
 */
public String getLastName() {
	return lastName;
}

/**
 * Getter for Account of Customer.
 * 
 * @return account of Customer
 */
public Account getAccount() {
	return account;
}

/**
 * Setter for Account of Customer.
 */
public void setAccount(Account account) {
	this.account = account;
}
}
