package com.mypets.models;

public class Pet {

	private String owner;
	private String nameOfPet;
	private double weight;
	private String colour;
	
	
	public enum Colour {
		BLACK, WHITE, GREY, BLUE, RED, BROWN
	}

	public void vioce() {
		System.out.println("?!#$!");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Pet [owner=%s, nameOfPet=%s, weight=%s, colour=%s]", owner, nameOfPet, weight, colour);
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * @return the nameOfPet
	 */
	public String getNameOfPet() {
		return nameOfPet;
	}

	/**
	 * @param nameOfPet the nameOfPet to set
	 */
	public void setNameOfPet(String nameOfPet) {
		this.nameOfPet = nameOfPet;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * @param colour the colour to set
	 */
	public void setColour(Colour main, Colour scnd, Colour thrd) {
		this.colour = String.format("%s-%s-%s", main, scnd, thrd);
	}	

}
