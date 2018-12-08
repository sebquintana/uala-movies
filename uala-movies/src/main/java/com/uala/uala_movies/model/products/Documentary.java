package com.uala.uala_movies.model.products;

public class Documentary extends Product {

	private String title;
	
	@Override
	public boolean isItInteresting() {
		return title.contains("unoficial");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
