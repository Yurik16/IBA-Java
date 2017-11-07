package com.mypets.models;

import com.mypets.models.Pet.Colour;
import com.mypets.models.Pet.PetBuilder;

public interface IPetBuilder {
	public PetBuilder buildOwner(final String o);
	public PetBuilder buildNameOfPet(final String n);
	public PetBuilder buildWeight(final double w);
	public PetBuilder buildType(final Colour main, Colour scnd, Colour thrd);
	
	public Pet build();
}
