package com.mybank.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * class Bank.
 * 
 * @author Yury Chuksin
 * @version 1.0.0
 * @since 05-10-2017
 */
public class Bank {	
	
	private static List<Customer> customers;
	private static int numberOfCustomers;
	
	static {
		customers = new ArrayList<Customer>(10);
		numberOfCustomers = 0;
	}
	
	public Bank() {}
	
	public static void addCustomer(String f, String l) {
		customers.add(new Customer(f, l));
		Bank.numberOfCustomers++;
	}
	
	public static int getNumOfCustomers() {
		return numberOfCustomers;
	}
	
	public static Customer getCustomer(int index) {
		return customers.get(index);
	}
	
	public static List<Customer> getCustomers() {
	return customers;
	}
}
