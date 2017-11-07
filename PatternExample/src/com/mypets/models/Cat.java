package com.mypets.models;

public class Cat extends Pet{
	
	private double tailLength;
	private double mustacheLength;
	
	/**
	 * @return the tailLength
	 */
	public double getTailLength() {
		return tailLength;
	}
	/**
	 * @param tailLength the tailLength to set
	 */
	public void setTailLength(double tailLength) {
		this.tailLength = tailLength;
	}
	/**
	 * @return the mustacheLength
	 */
	public double getMustacheLength() {
		return mustacheLength;
	}
	/**
	 * @param mustacheLength the mustacheLength to set
	 */
	public void setMustacheLength(double mustacheLength) {
		this.mustacheLength = mustacheLength;
	}
	
	
}
