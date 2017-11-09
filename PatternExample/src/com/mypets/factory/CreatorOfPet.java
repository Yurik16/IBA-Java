package com.mypets.factory;

import com.mypets.models.Pet;

public class CreatorOfPet {
	
	IPetFactory factory;
	Pet pet;
	
	public CreatorOfPet() {
		
	}
	
	public CreatorOfPet(IPetFactory f) {
		this.factory = f;
		this.pet = this.factory.creatPet();
		}
	
	public void setFactory(IPetFactory f) {this.factory = f;}
	
	public Pet getPetFromCreator() {return this.pet;}
	
	public Pet createPet() {
		return this.factory.creatPet();
	}
}
