package com.mypets.builder;

import com.mypets.models.Dog;
import com.mypets.models.Pet;
import com.mypets.models.Pet.Colour;

public class DogBuilder implements IPetBuilder {
	
	Dog dog;

	public DogBuilder() {this.dog = new Dog();}
	
	@Override
	public IPetBuilder buildOwner(String o) {
		dog.setOwner(o);
		return this;
	}

	@Override
	public IPetBuilder buildNameOfPet(String n) {
		dog.setNameOfPet(n);
		return this;
	}

	@Override
	public IPetBuilder buildWeight(double w) {
		dog.setWeight(w);
		return this;
	}

	@Override
	public IPetBuilder buildColour(Colour main, Colour scnd, Colour thrd) {
		dog.setColour(main, scnd, thrd);
		return this;
	}
	
	public IPetBuilder buildHeight(Double h) {
		dog.setHeight(h);
		return this;
	}

	public IPetBuilder buildTeeth(Double t) {
		dog.setTeeth(t);
		return this;
	}
	@Override
	public Pet getThisPet() {
		return this.dog;
	}

}
