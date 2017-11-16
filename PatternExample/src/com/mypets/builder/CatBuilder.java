package com.mypets.builder;

import com.mypets.models.Cat;
import com.mypets.models.Pet;
import com.mypets.models.Pet.Colour;

public class CatBuilder implements IPetBuilder{

	private Cat cat;
	
	public CatBuilder() {this.cat = new Cat();}
	
	@Override
	public void buildOwner(String o) {
		cat.setOwner(o);
	}

	@Override
	public void buildNameOfPet(String n) {
		cat.setNameOfPet(n);
	}

	@Override
	public void buildWeight(double w) {
		cat.setWeight(w);
	}

	@Override
	public void buildColour(Colour main, Colour scnd, Colour thrd) {
		cat.setColour(main, scnd, thrd);
	}
	
	public void buildTailLength(double t) {
		cat.setTailLength(t);
	}

	public void buildMustacheLength(Double m) {
		cat.setMustacheLength(m);
	}

	@Override
	public Pet getPet() {
		return this.cat;
	}

	@Override
	public void createPet() {
		this.buildNameOfPet("CatFromBuilder");
		this.buildOwner("CatOwner");
		this.buildWeight(4.32);
		this.buildColour(Colour.BLACK, Colour.BLACK, Colour.BLACK);
		this.buildMustacheLength(0.12);
		this.buildTailLength(0.45);
	}

}