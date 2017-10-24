package com.mybank.domain;



import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

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
	public void withdraw(double amt) throws OverdraftException {

		if (this.balance < amt) {
		double overdraftNeded = amt - this.balance;
			if(overdraftAmount < overdraftNeded) {
			throw new OverdraftException("Overdraft is less than you needs", overdraftNeded);
		} else {
			this.balance = 0.0;
			overdraftAmount -= overdraftNeded;
		}
		} else {
			this.balance -= amt;
		}

	}

	@Override
	public int hashCode() {		
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public boolean equals(Object obj) {		
		return EqualsBuilder.reflectionEquals(this, obj);
	}

}
