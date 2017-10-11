package com.mybank.batch;

import com.mybank.domain.Account;
import com.mybank.domain.Bank;
import com.mybank.domain.Customer;
import com.mybank.domain.SavingsAccount;

/**
 * 
 * class AccumulateSavingsBatch.
 * 
 * @author Yury Chuksin
 * @version 1.0.0
 * @since 06-10-2017
 */
public class AccumulateSavingsBatch {
	
	private Bank bank;
	
	public void doBatch() {

		for(int i = 0; i < Bank.getNumOfCustomers(); i++) {
			Customer cust = Bank.getCustomer(i);
			for(int j = 0; j < cust.getNumOfAccounts(); j++) {
				Account acc = cust.getAccount(j);
				if(acc instanceof SavingsAccount) {
					SavingsAccount savingAcc = (SavingsAccount) acc;
					savingAcc.accumulateInterest();
				}
			}
		}
	}
	
	public void setBank(Bank b) {
		this.bank = b;
	}
	
	public Bank getBank() {
		return this.bank;
	}
}
