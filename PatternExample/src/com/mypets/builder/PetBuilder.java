package com.mypets.builder;

import com.mypets.models.Pet;
import com.mypets.models.Pet.Colour;

public class PetBuilder implements IPetBuilder{
	
	private Pet pet;	
	
	/**
	 * @return the pet
	 */
	public Pet getPet() {
		return pet;
	}

	public PetBuilder() {this.pet = new Pet();}
	
	@Override
	public void buildOwner(String o) {
		pet.setOwner(o);
	}
	
	@Override
	public void buildNameOfPet(String name) {
		pet.setNameOfPet(name);
	}
	
	@Override
	public void buildWeight(final double w) {
		pet.setWeight(w);
	}
	
	@Override
	public void buildColour(Colour main, Colour scnd, Colour thrd) {
		pet.setColour(main, scnd, thrd);
	}

	@Override
	public void createPet() {
		this.buildNameOfPet("PetFromBuilder");
		this.buildOwner("Owner FromBuilder");
		this.buildWeight(12.34);
		this.buildColour(Colour.BLUE, Colour.BLUE, Colour.BLUE);		
	}
	
}
