package com.mybank.domain;

/**
 * 
 * @author Yury Chuksin
 *
 * @version 1.0.0
 * @since 03 10 2017
 *
 */
public class CheckingAccount extends Account{

	private double overdraftAmount;
	
	public CheckingAccount(double initBalance, double overdraft) {
		super(initBalance);
		this.overdraftAmount = overdraft;
	}
	
	
	public CheckingAccount(double initBalance) {
		super(initBalance);
	}
	
	@Override
	public boolean withdraw(double amt) {
		boolean result = true;
		if (this.balance < amt) {
		double overdraftNeded = amt - this.balance;
			if(overdraftAmount < overdraftNeded) {
			result = false;
		} else {
			this.balance = 0.0;
			overdraftAmount -= overdraftNeded;
		}
		} else {
			this.balance -= amt;
		}
		return result;
	}

}