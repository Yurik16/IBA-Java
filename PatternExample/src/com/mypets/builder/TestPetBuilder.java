package com.mypets.builder;

public class TestPetBuilder {

	public static void main(String[] args) {
		Director director = new Director(new DogBuilder());
		System.out.println(director.build());
		director.getBuilder().buildNameOfPet("Grath");
		System.out.println(director.getBuilder().getPet());
	}

}
