package com.uala.uala_movies.analyzer;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import com.uala.uala_movies.model.products.builder.DocumentaryBuilder;
import com.uala.uala_movies.model.products.builder.MovieBuilder;
import com.uala.uala_movies.model.products.builder.SerieBuilder;
import com.uala.uala_movies.model.users.User;
import com.uala.uala_movies.model.users.builder.UserBuilder;

public class UalaMoviesUserAnalyzerTest {
	
	private static UalaMoviesUserAnalyzer analizer;
	
	@BeforeClass
	public static void setUp() {
		analizer = new UalaMoviesUserAnalyzer();
	}
	
	
	@Test
	public void isWatchingInterestingSerieTest() {
		User interestingUser = new UserBuilder().watching(new SerieBuilder().withSeasons(4).build()).build();
		assertTrue(analizer.isWatchingSomethingInteresting(interestingUser));
		
	}
	
	@Test
	public void isNotWatchingInterestingSerieTest() {
		User boringUser = new UserBuilder().watching(new SerieBuilder().withSeasons(1).build()).build();
		assertFalse(analizer.isWatchingSomethingInteresting(boringUser));
	}
	
	@Test
	public void isWatchingInterestingDocumentaryTest() {
		User interestingUser = new UserBuilder().watching(new DocumentaryBuilder().withTitle("Juan Roman Riquelme - unoficial").build()).build();
		assertTrue(analizer.isWatchingSomethingInteresting(interestingUser));
		
	}
	
	@Test
	public void isNotWatchingInterestingDocumentaryTest() {
		User boringUser = new UserBuilder().watching(new DocumentaryBuilder().withTitle("Juan Roman Riquelme - oficial").build()).build();
		assertFalse(analizer.isWatchingSomethingInteresting(boringUser));
	}
	
	@Test
	public void isWatchingInterestingMovieTest() {
		User interestingUser = new UserBuilder().watching(new MovieBuilder().withOscarsAwardsWon(3).build()).build();
		assertTrue(analizer.isWatchingSomethingInteresting(interestingUser));
		
	}
	
	@Test
	public void isNotWatchingInterestingMovieTest() {
		User boringUser = new UserBuilder().watching(new MovieBuilder().withOscarsAwardsWon(0).build()).build();
		assertFalse(analizer.isWatchingSomethingInteresting(boringUser));
	}
}
