package com.mypets.models;

public class Pet {	

	private final String owner;
	private final String nameOfPet;
	private final double weight;
	private final String colour;
	
	public Pet(IPetBuilder builder) {
			
			this.owner = builder.getOwner();
			this.nameOfPet = builder.getNameOfPet();
			this.weight = builder.getWeight();
			this.colour = builder.getColour();
		}
	
	
	class PetBuilder implements IPetBuilder{		

		private String owner;
		private String nameOfPet;
		private double weight;
		private String colour;
		
		@Override
		public PetBuilder owner(final String o) {
			this.owner = o;
			return this;
		}
		@Override
		public PetBuilder nameOfPet(final String n) {
			this.nameOfPet = n;
			return this;
		}
		@Override
		public PetBuilder weight(final double w) {
			this.weight = w;
			return this;
		}
		@Override
		public PetBuilder type(final Colour main, Colour scnd, Colour thrd) {
			this.colour = String.format("%s-%s-%S", main.name(), scnd.name(), thrd.name());
			return this;
		}
		
		/**
		 * @return the owner
		 */
		public String getOwner() {
			return owner;
		}
		/**
		 * @return the nameOfPet
		 */
		public String getNameOfPet() {
			return nameOfPet;
		}
		/**
		 * @return the weight
		 */
		public double getWeight() {
			return weight;
		}
		/**
		 * @return the colour
		 */
		public String getColour() {
			return colour;
		}
		
		public Pet build() {
			return new Pet(this);
		}
	}
	
	public enum Colour {
		BLACK, WHITE, GREY, BLUE, RED, BROWN
	}
}
