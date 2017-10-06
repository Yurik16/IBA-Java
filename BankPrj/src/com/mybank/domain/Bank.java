package com.mybank.domain;

/**
 * 
 * class Bank.
 * 
 * @author Yury Chuksin
 * @version 1.0.0
 * @since 05-10-2017
 */
public class Bank {	
	
	private Customer[] customers;
	private int numberOfCustomers;
	
	public Bank() {
		this.customers = new Customer[10];
		this.numberOfCustomers = 0;
	}
	
	public void addCustomer(String f, String l) {
		customers[numberOfCustomers++] = new Customer(f, l);
	}
	
	public int getNumOfCustomers() {
		return this.numberOfCustomers;
	}
	
	public Customer getCustomer(int index) {
		return customers[index];
	}
}
