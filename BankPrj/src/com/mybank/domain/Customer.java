package com.mybank.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * class Customer.
 * 
 * @author Yury Chuksin
 * @version 1.0.0
 * @since 28-09-2017
 */
public class Customer {

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
private List<Account> accounts;

private int numOfAccounts;

/**
 * Constructor of Customer.
 * @param fName First name of Customer
 * @param lName Last name of Customer
 */
public Customer(String fName, String lName) {
	this.firstName = fName;
	this.lastName = lName;
	this.accounts = new ArrayList<Account>(10);
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
 * @param index index of getting Account from Customer 
 * @return account of Customer
 */
public Account getAccount(int index) {
	return accounts.get(index);
}

/**
 * Getter for Account of Customer.
 * @return account of Customer with index 0
 */
public Account getAccount() {
	return accounts.get(0);
}

/**
 * Getter for Accounts Array of Customer.
 * @return Accounts Array
 */
public List<Account> getAccounts() {
	return accounts;
}

/**
 * Getting accounts number of Customer. 
 * @return integer number of accounts
 */
public int getNumOfAccounts() {	
	return this.numOfAccounts;
}

/**
 * Adding Account to Account Array of Customer.
 * @param acc Account to add
 */
public void addAccount(Account acc) {
	this.accounts.add(acc);
	this.numOfAccounts++;
}

@Override
public String toString() {
	return String.format("[%s %s]", this.getFirstName(), this.getLastName());
}
}
