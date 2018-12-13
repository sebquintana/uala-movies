package com.uala.uala_movies.recomendator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.uala.uala_movies.model.products.builder.SerieBuilder;
import com.uala.uala_movies.recomendator.builder.UalaProductRecomendatorBuilder;

public class UalaProductRecomendatorTest {


	@Test
	public void askForRecomendationTest() {

		UalaProductRecomendator recomendador = new UalaProductRecomendatorBuilder()
				.withProduct(new SerieBuilder().withSeasons(5).withId(1).build()).build();
		assertEquals(1, recomendador.recommendProduct().getId());
	}
}
