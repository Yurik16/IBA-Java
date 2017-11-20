package com.mypets.factory;

import com.mypets.builder.CatBuilder;
import com.mypets.models.Pet;
import com.mypets.models.Pet.Colour;

public class CatFactory implements IPetFactory {

	CatBuilder catBuilder;
	
	public CatFactory() {this.catBuilder = new CatBuilder();}
	
	@Override
	public Pet creatPet() {
		catBuilder.buildNameOfPet("NameFromFactory");
		catBuilder.buildOwner("OwnerFromFactory");
		catBuilder.buildColour(Colour.BLACK, Colour.WHITE, Colour.BLACK);
		catBuilder.buildMustacheLength(0.11);
		catBuilder.buildTailLength(0.55);
		catBuilder.buildWeight(4.0);
		return this.catBuilder.getPet();
	}

	
}
