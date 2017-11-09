package com.mypets.factory;

import com.mypets.models.Pet;

public class FactoryTest {

	public static void main(String[] args) {
		
		PetFactory petF = new PetFactory();
		CatFactory catF = new CatFactory();
		DogFactory dogF = new DogFactory();
		
		IPetFactory factory = new CatFactory();
		Pet pet = factory.creatPet();
		System.out.println(pet);
		Pet unknown = new DogFactory().creatPet();
		System.out.println(unknown);
		Pet newPet = new CreatorOfPet(new PetFactory()).getPetFromCreator();
		CreatorOfPet creator = new CreatorOfPet();
		creator.setFactory(catF);
		System.out.println(newPet);
		System.out.println(creator.createPet());
	}

}
