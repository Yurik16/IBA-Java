package com.mypets.factory;

public class PetFactory {

	IPetFactory factory;
	
	public void setFactory(IPetFactory f) {
		this.factory = f;
	}
	
}
