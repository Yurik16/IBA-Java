package com.mypets.models;

import com.mypets.models.Pet.Colour;
import com.mypets.models.Pet.PetBuilder;

public interface IPetBuilder {
	public PetBuilder owner(final String o);
	public PetBuilder nameOfPet(final String n);
	public PetBuilder weight(final double w);
	public PetBuilder type(final Colour main, Colour scnd, Colour thrd);
	
	public String getOwner();
	public String getNameOfPet();
	public double getWeight();
	public String getColour();
	
	public Pet build();
}
