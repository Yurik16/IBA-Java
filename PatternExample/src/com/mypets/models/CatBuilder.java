package com.mypets.models;

import com.mypets.models.Pet.PetBuilder;

public class CatBuilder extends PetBuilder{
	
	private double tailLength;
	private double mustacheLength;

	public Cat build() {
		return new Cat(this);
	}
	
	public CatBuilder tailLength(double tl) {
		this.tailLength = tl;
		return this;
	}
	
	public CatBuilder mustacheLength(double ml) {
		this.mustacheLength = ml;
		return this;
	}
	
	public double getTailLength() {
		return this.tailLength;
	}
	
	public double getMustacheLength() {
		return this.mustacheLength;
	}
}