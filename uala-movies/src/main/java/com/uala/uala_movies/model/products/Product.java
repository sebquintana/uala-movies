package com.uala.uala_movies.model.products;

public abstract class Product {

	private int id;
	private double duration;
	private int releaseYear;
	
	public abstract boolean isItInteresting();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
