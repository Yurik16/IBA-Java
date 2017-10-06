package com.mybank.domain;

/**
 * 
 * class Customer.
 * 
 * @author Yury Chuksin
 * @version 1.0.0
 * @since 28-09-2017
 */
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
 * Accounts of Customer.
 */
private Account[] accounts;

private int numOfAccounts;

/**
 * Constructor of Customer.
 * @param fName First name of Customer
 * @param lName Last name of Customer
 */
public Customer(String fName, String lName) {
	this.firstName = fName;
	this.lastName = lName;
	this.accounts = new Account[10];
	this.numOfAccounts = 0;

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
 * @return last name
 */
public String getLastName() {
	return lastName;
}

/**
 * Getter for Account of Customer. 
 * @return account of Customer
 */
public Account getAccount(int index) {
	return accounts[index];
}

public Account getAccount() {
	return accounts[0];
}

/**
 * Setter for accounts of Customer.
 * @param account account of Customer
 */
public void setAccount(Account account) {
	this.accounts[numOfAccounts] = account;
}

/**
 * Getting accounts number of Customer. 
 * @return integer number of accounts
 */
public int getNumOfAccounts() {	
	return this.numOfAccounts;
}

public void addAccount(Account acc) {
	this.accounts[numOfAccounts++] = acc;
}
}
