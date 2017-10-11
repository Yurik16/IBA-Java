package com.mybank.domain;

/**
 * 
 * class OverdraftExeption.
 * 
 * @author Yury Chuksin
 * @version 1.0.0
 * @since 11-10-2017
 */
public class OverdraftException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double deficit;
	
	public OverdraftException(String msg, double d) {
		super(msg);
		this.deficit = d;
	}
	
	public double getDeficit() {
		return this.deficit;
	}
}
