package com.mybank.reflecton;

import com.mybank.domain.Customer;

/**
 * 
 * class RefShow.
 * 
 * @author Yury Chuksin
 * @version 1.0.0
 * @since 29-09-2017
 */
public class RefShow {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InstantiationException, ClassNotFoundException {
		RefCheker cheker = new RefCheker();
		Customer bill = new Customer("Bill", "Murray");
		
		cheker.showClassName(bill);
		cheker.showClassMethods(bill);
		cheker.showClassFields(bill);
		cheker.showFieldValue(bill);
		cheker.setInPrivateFields(bill);
	}

}
