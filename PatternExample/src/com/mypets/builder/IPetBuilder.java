package com.mypets.builder;

import com.mypets.models.Pet;
import com.mypets.models.Pet.Colour;

public interface IPetBuilder {

	public void buildOwner(final String o);
	public void buildNameOfPet(final String n);
	public void buildWeight(final double w);
	public void buildColour(final Colour main, Colour scnd, Colour thrd);
	
	public void createPet();
	public Pet getPet();

}
