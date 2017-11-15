package com.mypets.builder;

public class Director {

	private IPetBuilder builder;	
	
	void setBuilder(IPetBuilder b) {
		this.builder = b;
	}
	
	public IPetBuilder getBuilder() {return this.builder;}
	
}
