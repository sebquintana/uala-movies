package com.uala.uala_movies.model.products.builder;

import com.uala.uala_movies.model.products.Serie;

public class SerieBuilder {

	private  Serie serie;
	
	public SerieBuilder() {
		serie = new Serie();
	}
	
	public Serie build() {
		return serie;
	}
	
	public SerieBuilder withSeasons(int seasons) {
		serie.setSeasons(seasons);
		return this;
	}
	
	public SerieBuilder withId(int id) {
		serie.setId(id);
		return this;
	}
}
