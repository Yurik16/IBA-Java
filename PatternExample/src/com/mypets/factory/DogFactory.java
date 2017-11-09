package com.mypets.factory;

import com.mypets.models.Dog;
import com.mypets.models.Pet;
import com.mypets.models.Pet.Colour;

public class DogFactory implements IPetFactory {

	Dog dog;
	
	public DogFactory() {this.dog = new Dog();}
	
	@Override
	public Pet creatPet() {
		dog.setNameOfPet("Rex");
		dog.setOwner("OwnerOfDog");
		dog.setColour(Colour.BROWN, Colour.WHITE, Colour.BROWN);
		dog.setHeight(0.55);
		dog.setTeeth(0.05);
		dog.setWeight(21.0);
		return this.dog;
	}

}
