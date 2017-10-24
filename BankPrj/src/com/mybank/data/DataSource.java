package com.mybank.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.mybank.domain.Bank;
import com.mybank.domain.CheckingAccount;
import com.mybank.domain.Customer;
import com.mybank.domain.SavingsAccount;

/**
 * 
 * class DataSource.
 * 
 * @author Yury Chuksin
 * @version 1.0.0
 * @since 19-10-2017
 */
public class DataSource {
	private File dataFile;
	public DataSource(String dataFilePath) {
		this.dataFile = new File(dataFilePath);
	}
	public void loadData() throws FileNotFoundException {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(dataFile);
		Customer customer;
		int numOfCustomers = input.nextInt();
	       
	    for ( int idx = 0; idx < numOfCustomers; idx++ ) {	        
	        String firstName = input.next();
	        String lastName = input.next();
	        Bank.addCustomer(firstName, lastName);
	        customer = Bank.getCustomer(idx);	       
	        int numOfAccounts = input.nextInt();
	        
	        while ( numOfAccounts-- > 0 ) {	          
	          char accountType = input.next().charAt(0);	          
	          switch ( accountType ) {
	            case 'S': {
	              float initBalance = (float)input.nextFloat();
	              float interestRate = (float)input.nextFloat();
	              customer.addAccount(new SavingsAccount(initBalance, interestRate));
	              break;
	            }
	            case 'C': {
	              float initBalance = (float)input.nextFloat();
	              float overdraftProtection = (float)input.nextFloat();
	              customer.addAccount(new CheckingAccount(initBalance, overdraftProtection));
	              break;
	            }
	        }
	      }
	    }
	  }
	}
