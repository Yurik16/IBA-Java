package com.mypets.models;

public class CatBuilder extends PetBuilder{
	
	private Cat cat;

	@Override
	CatBuilder buildNameOfPet(String name) {
		cat.setNameOfPet(String.format("Cat-%s", name));
		return this;
	}
	
	CatBuilder buildTail(double t) {
		cat.setTailLength(t);
		return this;
	}
	
	CatBuilder buildMustache(double m) {
		cat.setMustacheLength(m);
		return this;
	}
}