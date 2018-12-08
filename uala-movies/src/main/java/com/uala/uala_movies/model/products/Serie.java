package com.uala.uala_movies.model.products;

public class Serie extends Product {

	private int seasons;
	
	@Override
	public boolean isItInteresting() {
		return seasons == 4 || seasons == 5;
	}

	public int getSeasons() {
		return seasons;
	}

	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}
	
}
