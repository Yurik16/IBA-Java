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
	
	private static Customer[] customers;
	private static int numberOfCustomers;
	
	static {
		customers = new Customer[10];
		numberOfCustomers = 0;
	}
	
	public Bank() {}
	
	public static void addCustomer(String f, String l) {
		customers[numberOfCustomers++] = new Customer(f, l);
	}
	
	public static int getNumOfCustomers() {
		return numberOfCustomers;
	}
	
	public static Customer getCustomer(int index) {
		return customers[index];
	}
	
	public static Customer[] getCustomers() {
	return customers;
	}
}
