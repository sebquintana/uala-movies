package com.uala.uala_movies.model.products;

public class Movie extends Product {

	private int oscarsAwardsWon;
	
	@Override
	public boolean isItInteresting() {
		return oscarsAwardsWon > 0;
	}

	public int getOscarsAwardsWon() {
		return oscarsAwardsWon;
	}

	public void setOscarsAwardsWon(int oscarsAwardsWon) {
		this.oscarsAwardsWon = oscarsAwardsWon;
	}
	
}
