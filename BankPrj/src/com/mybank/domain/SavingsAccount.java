package com.mybank.domain;

/**
 * 
 * @author Yury Chuksin
 *
 * @version 1.0.0
 * @since 03 10 2017
 *
 */
public class SavingsAccount extends Account{

	private double interestRate;
	
	public SavingsAccount(double initBalance, double interestRate) {
		super(initBalance);
		this.setInterestRate(interestRate);
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}
