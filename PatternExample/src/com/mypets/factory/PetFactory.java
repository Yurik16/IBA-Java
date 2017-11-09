package com.mypets.factory;

import com.mypets.models.Pet;
import com.mypets.models.Pet.Colour;

public class PetFactory implements IPetFactory{

	Pet pet;

	public PetFactory() {
		this.pet = new Pet();
	}

	@Override
	public Pet creatPet() {
		pet.setNameOfPet("SomeName");
		pet.setOwner("OutOfOwner");
		pet.setWeight(1.0);
		pet.setColour(Colour.GREY, Colour.GREY, Colour.GREY);
		return this.pet;
	}
	
}
