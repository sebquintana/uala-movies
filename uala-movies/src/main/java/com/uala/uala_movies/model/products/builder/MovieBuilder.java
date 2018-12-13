package com.uala.uala_movies.model.products.builder;

import com.uala.uala_movies.model.products.Movie;

public class MovieBuilder {

	private Movie movie;

	public MovieBuilder() {
		movie = new Movie();
	}

	public Movie build() {
		return movie;
	}

	public MovieBuilder withOscarsAwardsWon(int oscarsAwardsWon) {
		movie.setOscarsAwardsWon(oscarsAwardsWon);
		return this;
	}
}
