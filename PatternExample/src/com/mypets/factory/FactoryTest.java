package com.mypets.factory;

import com.mypets.models.Pet;

public class FactoryTest {

	public static void main(String[] args) {
		
		IPetFactory factory = new CatFactory();
		Pet pet = factory.creatPet();
		System.out.println(pet);		
	}

}
