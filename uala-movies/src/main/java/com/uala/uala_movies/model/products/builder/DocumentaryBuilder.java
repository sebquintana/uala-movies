package com.uala.uala_movies.model.products.builder;

import com.uala.uala_movies.model.products.Documentary;

public class DocumentaryBuilder {

	private Documentary documentary;

	public DocumentaryBuilder() {
		documentary = new Documentary();
	}

	public Documentary build() {
		return documentary;
	}

	public DocumentaryBuilder withTitle(String title) {
		documentary.setTitle(title);
		return this;
	}
}
