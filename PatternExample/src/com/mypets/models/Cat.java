package com.mypets.models;

public class Cat extends Pet{
	
	private double tailLength = 0.44;
	private double mustacheLength = 0.11;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Cat [owner=%s, nameOfPet=%s, weight=%s, colour=%s, tailLength=%s, mustacheLength=%s]",
				this.getOwner(),
				this.getNameOfPet(),
				this.getWeight(),
				this.getColour(),
				tailLength,
				mustacheLength);
	}
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
	@Override
	public void vioce() {		
		System.out.println("Miu-Miu");
	}
	
	
}
