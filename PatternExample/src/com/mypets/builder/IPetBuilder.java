package com.mypets.builder;

import com.mypets.models.Pet;
import com.mypets.models.Pet.Colour;

public interface IPetBuilder {

	public IPetBuilder buildOwner(final String o);
	public IPetBuilder buildNameOfPet(final String n);
	public IPetBuilder buildWeight(final double w);
	public IPetBuilder buildColour(final Colour main, Colour scnd, Colour thrd);
	
	public void createPet();
	public Pet getThisPet();

}
