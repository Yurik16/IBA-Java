package com.mybank.domain;

/** 
 * class Account
 * 
 * @author Yury Chuksin
 * @version 1.0.0
 * @since 27.09.2017
 */
public class Account {
	
	/**
	 * Current account balance of User.
	 */
	private double balance;
	
	/**
	 * Getter for balance.
	 * 
	 * @return current balance
	 */
	public double getBalance() {
		return this.balance;
	}
	
	/**
	 * Deposit method, adding specified number.
	 * 
	 * @param depo specified number for adding.
	 */
	public void deposit(double put) {
		this.balance += put;
	}
	
	/**
	 * Withdraw method, taking specified number.
	 *  
	 * @param take specified number for taking.
	 */
	public boolean withdraw(double take) {
		if(take <= this.balance) {
			this.balance -= take;
		}
		return take <= this.balance;
	}
	
	/**
	 * Constructor of Account.
	 * 
	 * @param initBalance current account balance of User
	 */
	public Account(double initBalance) {
		this.balance = initBalance;
	}
}
