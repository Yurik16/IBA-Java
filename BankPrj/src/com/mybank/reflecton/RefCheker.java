package com.mybank.reflecton;

import java.lang.annotation.Annotation;
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

	/**
	 * Show class name.
	 * @param instance name of asking class
	 */
	public void showClassName(Object o) {
		Class cls = o.getClass();
		System.out.println(cls.getName());		
	}
	
	/**
	 * Show class fields.
	 * @param instance name of asking fields
	 */
	public void showClassFields(Object o) {
		Class cls = o.getClass();
		Field[] fields = cls.getDeclaredFields();
		for(Field x : fields) {
			System.out.println(x.getName());
		}
	}
	
	/**
	 * Show class methods.
	 * @param instance name of asking methods
	 */
	public void showClassMethods(Object o) {
		Class cls = o.getClass();
		Method[] methods = cls.getMethods();
		for(Method x : methods) {
			System.out.println(x.getName());
			}
	}
	
	/**
	 * Show values of fields.
	 * @param instance name
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public void showFieldValue(Object o) throws IllegalArgumentException, IllegalAccessException, InstantiationException {
		Class cls = o.getClass();
		Field[] fields = cls.getDeclaredFields();
		for(Field x : fields) {
			x.setAccessible(true);
			System.out.println(String.format(" Field name -> %s, value -> %s", x.getName(), x.get(o)));
		}
	}
	/**
	 * Show fields annotations.
	 * @param instance name
	 */
	public void showFieldsAnnotations(Object o) {
		Class cls = o.getClass();
		Field[] fields = cls.getDeclaredFields();
		for(Field x : fields) {
			Annotation[] annotations = x.getAnnotations();
			for(Annotation a : annotations) {
				System.out.println(String.format("Field -> %s | Annotation -> %s", x.getName(), a.toString()));
			}
		}
	}
	
	public void setInPrivateFields(Object o) throws IllegalArgumentException, IllegalAccessException {
		Class cls = o.getClass();
		Field[] fields = cls.getDeclaredFields();
		for(Field x : fields) {
			x.setAccessible(true);
			if(x.getName().equals("lastName")) {
				x.set(o, "Smith");
				}
			System.out.println(String.format(" Field name -> %s, value -> %s", x.getName(), x.get(o)));
			}
	}
}
