package com.mypets.builder;

import com.mypets.models.Pet;

public class Director {

	private IPetBuilder builder;
	
	
	
	public Director(IPetBuilder builder) {
		super();
		this.builder = builder;		
	}

	void setBuilder(IPetBuilder b) {
		this.builder = b;
	}
	
	public IPetBuilder getBuilder() {return this.builder;}
	
	public Pet build() {
		this.builder.createPet();
		return this.builder.getPet();
	}
	
}
