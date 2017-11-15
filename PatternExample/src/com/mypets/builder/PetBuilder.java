package com.mypets.builder;

import com.mypets.models.Pet;
import com.mypets.models.Pet.Colour;

public class PetBuilder implements IPetBuilder{
	
	private Pet pet;	
	
	public PetBuilder() {this.pet = new Pet();}
	
	public IPetBuilder buildOwner(String o) {
		pet.setOwner(o);
		return this;
	}

	public IPetBuilder buildNameOfPet(String name) {
		pet.setNameOfPet(name);
		return this;
	}

	public IPetBuilder buildWeight(final double w) {
		pet.setWeight(w);
		return this;
	}

	public IPetBuilder buildColour(Colour main, Colour scnd, Colour thrd) {
		pet.setColour(main, scnd, thrd);
		return this;
	}		
	
	public Pet getThisPet() {
		return this.pet;
	}
	
}
