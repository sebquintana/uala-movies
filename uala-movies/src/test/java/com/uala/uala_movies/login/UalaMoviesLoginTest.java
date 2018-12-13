package com.uala.uala_movies.login;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import com.uala.uala_movies.model.users.User;
import com.uala.uala_movies.model.users.builder.UserBuilder;
import com.uala.uala_movies.subscriptions.builder.SubscriptionBuilder;

public class UalaMoviesLoginTest {

	private static UalaMoviesLogin ualaMoviesLogin;

	@BeforeClass
	public static void setUp() {
		ualaMoviesLogin = new UalaMoviesLogin();
	}

	@Test
	public void accountWithNoOneUserWithClassicSubscriptionLoginTest() {
		User user = new UserBuilder().withSubscription(new SubscriptionBuilder().classicSubscription().build())
				.withPeopleOnline(0).build();
		assertTrue(ualaMoviesLogin.login(user));
	}

	@Test
	public void accountWithTwoUserWithClassicSubscriptionLoginTest() {
		User user = new UserBuilder().withSubscription(new SubscriptionBuilder().classicSubscription().build())
				.withPeopleOnline(2).build();
		assertFalse(ualaMoviesLogin.login(user));
	}

	@Test
	public void accountWithOneUserWithGoldSubscriptionLoginTest() {
		User user = new UserBuilder().withSubscription(new SubscriptionBuilder().goldSubscription().build())
				.withPeopleOnline(1).build();
		assertTrue(ualaMoviesLogin.login(user));
	}

	@Test
	public void accountWithFourUserWithClassicSubscriptionLoginTest() {
		User user = new UserBuilder().withSubscription(new SubscriptionBuilder().goldSubscription().build())
				.withPeopleOnline(4).build();
		assertFalse(ualaMoviesLogin.login(user));
	}

	@Test
	public void accountWithOneUserWithPlatinumSubscriptionLoginTest() {
		User user = new UserBuilder().withSubscription(new SubscriptionBuilder().platinumSubscription().build())
				.withPeopleOnline(1).build();
		assertTrue(ualaMoviesLogin.login(user));
	}

	@Test
	public void accountWithSixUserWithPlatinumSubscriptionLoginTest() {
		User user = new UserBuilder().withSubscription(new SubscriptionBuilder().platinumSubscription().build())
				.withPeopleOnline(6).build();
		assertFalse(ualaMoviesLogin.login(user));
	}
}
