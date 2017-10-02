package com.mybank.test;

import java.lang.reflect.Field;

import com.mybank.domain.Account;
import com.mybank.domain.Customer;

/** 
 * class TestBanking.
 * 
 * @author Yury Chuksin
 * @version 1.0.0
 * @since 28.09.2017
 */
public class TestBanking {

	public static void main(String[] args) {
		Customer customer = new Customer("Jane", "Smith");
		customer.setAccount(new Account(0.0));
		System.out.println(String.format("Creating the customer %s %s", customer.getFirstName(), customer.getLastName()));
		customer.getAccount().deposit(500.0);
		System.out.println(String.format("Creating her accont with a %s balance", customer.getAccount().getBalance()));
		final double wth = 150;
		customer.getAccount().withdraw(wth);
		System.out.println(String.format("Withdraw %s", wth));
		final double dep = 22.50;
		customer.getAccount().deposit(dep);
		System.out.println(String.format("Deposite %s", dep));
		final double wth2 = 47.62;
		customer.getAccount().withdraw(wth2);
		System.out.println(String.format("Withdraw %s", wth2));
		System.out.println(String.format("Customer %s has a balance of %s", customer.toString(), customer.getAccount().getBalance()));

	}

}
