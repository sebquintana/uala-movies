package com.uala.uala_movies.billing;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.uala.uala_movies.model.discounts.DiscountOldUser;
import com.uala.uala_movies.model.discounts.DiscountPayPal;
import com.uala.uala_movies.model.users.User;
import com.uala.uala_movies.model.users.builder.UserBuilder;
import com.uala.uala_movies.subscriptions.builder.SubscriptionBuilder;

public class UalaMoviesBillingTest {
	
	private static UalaMoviesBilling billing;
	
	@BeforeClass
	public static void setUp() {
		billing = new UalaMoviesBilling();
	}
	
	
	@Test
	public void calculateAmountToUserWithPayPalDiscountTest() {
		
		User user = new UserBuilder().withSubscription(new SubscriptionBuilder().classicSubscription().withPrize(100).build())
									.withDiscount(new DiscountPayPal())
									.build();
		assertEquals(98, billing.calculateAmount(user), 0);
	}
	
	@Test
	public void calculateAmountToUserWithoutDiscountTest() {
		
		User user = new UserBuilder().withSubscription(new SubscriptionBuilder().platinumSubscription().withPrize(100).build()).build();
		assertEquals(100, billing.calculateAmount(user), 0);
	}
	
	@Test
	public void calculateAmountToUserWithMoreThanOneYearAccountCreationDiscountTest() {
		
		User user = new UserBuilder().withSubscription(new SubscriptionBuilder().platinumSubscription().withPrize(100).build())
									.withDiscount(new DiscountOldUser())
									.build();
		assertEquals(97, billing.calculateAmount(user), 0);
	}
}
