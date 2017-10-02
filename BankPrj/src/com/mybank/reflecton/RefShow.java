package com.mybank.reflecton;

import com.mybank.domain.Customer;

public class RefShow {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InstantiationException {
		RefCheker cheker = new RefCheker();
		Customer bill = new Customer("Bill", "Murray");
		
		cheker.showClassName(bill);
		cheker.showClassFields(bill);
		cheker.showFieldValue(bill);
	}

}
