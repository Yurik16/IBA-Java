package com.mybank.test;
import com.mybank.domain.Account;

/**
 * 
 * class TestAccount2
 * 
 * @author Yury Chuksin
 * @version 1.0.0
 * @since 27.09.2017
 */
public class TestAccount2 {
/*
 * Main method.
 * Setting deposit with 100.0 than adding 47.0 than subtract 150.0
 */
	public static void main(String[] args) {
		Account acct = new Account(100.0);
		acct.deposit(47.0);
		acct.withdraw(150.0);
		System.out.println("Final account balance is " + acct.getBalance());
	}
}
