package com.mybank.domain;

import java.lang.reflect.Field;
/**
 * 
 * class GetFields
 * 
 * @author Yury Chuksin
 * @version 1.0.0
 * @since 29 сент. 2017 г.
 */
public class GetFields {
	
	public static void main(String[] args) {
		try {
			Class<?> cls = Class.forName("com.mybank.domain.Account");
			Object obj = cls.newInstance();
			Field[] fields = cls.getDeclaredFields();
			System.out.println(fields.getClass().getName());
			for(Field x : fields) {
				x.setAccessible(true);
				System.out.println(String.format(" Field name -> %s%n Field type -> %s%n Field value -> %s",
															x.getName(), x.getType().getName(), x.get(obj)));
			}
			
		} catch (Exception e) {		
			e.printStackTrace();
		}
		
	}
}
