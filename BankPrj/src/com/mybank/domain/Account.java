package com.mybank.domain;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/*
 * Account.java
 *
 * Created on November 9, 2005, 12:46 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 * 
 * @author Yury Chuksin
 *
 * @version 1.0.0
 * @since 28.09.2017
 */
public class Account {
    /* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		
		return HashCodeBuilder.reflectionHashCode(this);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	protected double balance;
    
    /**
     * Constructor of Account.
     * @param initBalance balance of Account
     */
    public Account(double initBalance) {
        balance = initBalance;
    }
    
    /**
     * Getter for balance of Account.
     * @return double balance of Account
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     * Adding specific number to deposit.
     * @param amt specific number
     */
    public boolean deposit(double amt) {
    	double start = this.balance;
        balance += amt;
        return start < this.balance;
    }
    
    /**
     * Subtract specific number from balance.
     * @param amt specific number
     */
    public boolean withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
        }
        return balance >= amt;
    }
}
