package com.mypets.builder;

import com.mypets.models.Dog;
import com.mypets.models.Pet;
import com.mypets.models.Pet.Colour;

public class DogBuilder implements IPetBuilder {
	
	Dog dog;

	public DogBuilder() {this.dog = new Dog();}
	
	@Override
	public void buildOwner(String o) {
		dog.setOwner(o);
	}

	@Override
	public void buildNameOfPet(String n) {
		dog.setNameOfPet(n);
	}

	@Override
	public void buildWeight(double w) {
		dog.setWeight(w);
	}

	@Override
	public void buildColour(Colour main, Colour scnd, Colour thrd) {
		dog.setColour(main, scnd, thrd);
	}
	
	public void buildHeight(Double h) {
		dog.setHeight(h);
	}

	public void buildTeeth(Double t) {
		dog.setTeeth(t);
	}
	
	@Override
	public Pet getPet() {
		return dog;
	}

	@Override
	public void createPet() {
		this.buildNameOfPet("DogFromBuilder");
		this.buildOwner("DogOwner");
		this.buildWeight(12.34);
		this.buildColour(Colour.BROWN, Colour.BROWN, Colour.BROWN);
		this.buildHeight(0.65);
		this.buildTeeth(0.29);
	}

}
