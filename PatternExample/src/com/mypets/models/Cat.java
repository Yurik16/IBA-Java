package com.mypets.models;

public class Cat extends Pet{

	private final double tailLength;
	private final double mustacheLength;
	
	public Cat(CatBuilder builder) {
		super(builder);
		this.tailLength = builder.getTailLength();
		this.mustacheLength = builder.getMustacheLength();
	}

	class CatBuilder extends PetBuilder{
		
		private double tailLength;
		private double mustacheLength;
		
		@Override
		public Pet build() {
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
}
