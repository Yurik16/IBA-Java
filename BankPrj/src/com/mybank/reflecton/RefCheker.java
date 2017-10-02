package com.mybank.reflecton;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * class RefCheker.java
 * 
 * @author Yury Chuksin
 * @version 1.0.0
 * @since 29-09-2017
 */
public class RefCheker {
	
	public void showClassName(Object o) {
		Class cls = o.getClass();
		System.out.println(cls.getName());		
	}
	
	public void showClassFields(Object o) {
		Class cls = o.getClass();
		Field[] fields = cls.getDeclaredFields();
		for(Field x : fields) {
			System.out.println(x.getName());
		}
	}
	public void showClassMethods(Object o) {
		Class cls = o.getClass();
		Method[] methods = cls.getMethods();
		for(Method x : methods) {
			System.out.println(x.getName());
			}
	}
	
	public void showFieldValue(Object o) throws IllegalArgumentException, IllegalAccessException, InstantiationException {
		Class cls = o.getClass();
		Field[] fields = cls.getDeclaredFields();
		for(Field x : fields) {
			x.setAccessible(true);
			System.out.println(String.format(" Field name -> %s, value -> %s", x.getName(), x.get(o)));
		}
	}
}
