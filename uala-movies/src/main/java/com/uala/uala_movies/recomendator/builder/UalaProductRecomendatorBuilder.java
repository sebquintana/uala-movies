package com.uala.uala_movies.recomendator.builder;

import com.uala.uala_movies.model.products.Product;
import com.uala.uala_movies.recomendator.UalaProductRecomendator;

public class UalaProductRecomendatorBuilder {

	private UalaProductRecomendator recomendador;


	public UalaProductRecomendatorBuilder() {
		recomendador = UalaProductRecomendator.getInstance();
	}

	public UalaProductRecomendator build() {
		return recomendador;
	}

	public UalaProductRecomendatorBuilder withProduct(Product product) {
		recomendador.addProduct(product);
		return this;
	}
}
