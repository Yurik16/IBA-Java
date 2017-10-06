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
	 * @param o instance name of asking class
	 */
	public void showClassName(Object o) {
		Class<?> cls = o.getClass();
		System.out.println(cls.getName());		
	}
	
	/**
	 * Show class fields.
	 * @param o instance name of asking fields
	 */
	public void showClassFields(Object o) {
		Class<?> cls = o.getClass();
		Field[] fields = cls.getDeclaredFields();
		for(Field x : fields) {
			System.out.println(x.getName());
		}
	}
	
	/**
	 * Show class methods.
	 * @param o instance name of asking methods
	 */
	public void showClassMethods(Object o) {
		Class<?> cls = o.getClass();
		Method[] methods = cls.getDeclaredMethods();
		for(Method x : methods) {
			System.out.println(x.getName());
			}
	}
	
	/**
	 * Show values of fields.
	 * @param o instance name
	 * @throws IllegalArgumentException exception
	 * @throws IllegalAccessException exception
	 * @throws InstantiationException exception
	 */
	public void showFieldValue(Object o) throws IllegalArgumentException, IllegalAccessException, InstantiationException {
		Class<?> cls = o.getClass();
		Field[] fields = cls.getDeclaredFields();
		for(Field x : fields) {
			x.setAccessible(true);
			System.out.println(String.format(" Field name -> %s, value -> %s", x.getName(), x.get(o)));
		}
	}
	/**
	 * Show fields annotations.
	 * @param o instance name
	 */
	public void showFieldsAnnotations(Object o) {
		Class<?> cls = o.getClass();
		Field[] fields = cls.getDeclaredFields();
		for(Field x : fields) {
			Annotation[] annotations = x.getAnnotations();
			for(Annotation a : annotations) {
				System.out.println(String.format("Field -> %s | Annotation -> %s", x.getName(), a.toString()));
			}
		}
	}
	/**
	 * Setting new value for private field. 
	 * @param o instance name
	 * @throws IllegalArgumentException exception
	 * @throws IllegalAccessException exception
	 */
	public void setInPrivateFields(Object o) throws IllegalArgumentException, IllegalAccessException {
		Class<?> cls = o.getClass();
		Field[] fields = cls.getDeclaredFields();
		for(Field x : fields) {
			x.setAccessible(true);
			if(x.getName().equals("lastName")) {
				x.set(o, "Smith");				
				}			
			System.out.println(String.format(" Field name -> %s, value -> %s", x.getName(), x.get(o)));
			x.setAccessible(false);
			}
	}
	
	public Object copyObject(Object nameOfObject) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> cls = nameOfObject.getClass();
		Object obj = cls.newInstance();
		
		return obj;
	}
}
