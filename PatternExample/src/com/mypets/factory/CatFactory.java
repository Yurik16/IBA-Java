package com.mypets.factory;

import com.mypets.models.Cat;
import com.mypets.models.Pet;
import com.mypets.models.Pet.Colour;

public class CatFactory implements IPetFactory {

	Cat cat;
	
	public CatFactory() {this.cat = new Cat();}
	
	@Override
	public Pet creatPet() {
		cat.setNameOfPet("Murzik");
		cat.setOwner("OwnerOfCat");
		cat.setColour(Colour.BLACK, Colour.WHITE, Colour.BLACK);
		cat.setMustacheLength(0.11);
		cat.setTailLength(0.55);
		cat.setWeight(4.0);
		return this.cat;
	}

	
}
