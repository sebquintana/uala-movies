package com.uala.uala_movies.model.discounts;

import com.uala.uala_movies.model.users.User;

public class DiscountPayPal implements Discounts{

	private static final double DISCOUNT_RATE = 2;

	public double getDiscountAmount(User user) {
		return (user.getSubscription().getPrize() / 100) * DISCOUNT_RATE;
	}

	
}
