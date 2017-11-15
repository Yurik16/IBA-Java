package com.mypets.builder;

import com.mypets.models.Cat;
import com.mypets.models.Pet;
import com.mypets.models.Pet.Colour;

public class CatBuilder implements IPetBuilder{

	private Cat cat;
	
	public CatBuilder() {this.cat = new Cat();}
	
	@Override
	public IPetBuilder buildOwner(String o) {
		cat.setOwner(o);
		return this;
	}

	@Override
	public IPetBuilder buildNameOfPet(String n) {
		cat.setNameOfPet(n);
		return this;
	}

	@Override
	public IPetBuilder buildWeight(double w) {
		cat.setWeight(w);
		return this;
	}

	@Override
	public IPetBuilder buildColour(Colour main, Colour scnd, Colour thrd) {
		cat.setColour(main, scnd, thrd);
		return this;
	}
	
	public IPetBuilder buildTailLength(double t) {
		cat.setTailLength(t);
		return this;
	}
	
	public IPetBuilder buildMustacheLength(Double m) {
		cat.setMustacheLength(m);
		return this;
	}

	@Override
	public Pet getThisPet() {
		return this.cat;
	}

}