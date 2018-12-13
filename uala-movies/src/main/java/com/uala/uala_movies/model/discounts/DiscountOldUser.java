package com.uala.uala_movies.model.discounts;

import java.util.Date;

import com.uala.uala_movies.model.users.User;

public class DiscountOldUser implements Discounts {

	private static final int DISCOUNT_RATE = 3;

	public double getDiscountAmount(User user) {
		
		double amount = 0;
		
		if(isOldUser(user.getAccountCreationDate())) {
			amount = (user.getSubscription().getPrize() / 100) * DISCOUNT_RATE;
		}
		
		return amount;
	}

	private boolean isOldUser(Date accountCreationDate) {
		// TODO : Cacular si paso un año desde la fecha de creacion hasta hoy. Para este caso devuelvo true. 
		return true;
	}

}
