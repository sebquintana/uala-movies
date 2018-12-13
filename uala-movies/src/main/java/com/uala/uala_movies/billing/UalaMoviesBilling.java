package com.uala.uala_movies.billing;

import java.util.ArrayList;
import java.util.List;

import com.uala.uala_movies.model.contact.CommunicationChannel;
import com.uala.uala_movies.model.discounts.DiscountOldUser;
import com.uala.uala_movies.model.discounts.DiscountPayPal;
import com.uala.uala_movies.model.discounts.Discounts;
import com.uala.uala_movies.model.users.User;

public class UalaMoviesBilling {

	private List<Discounts> discounts;
	
	public UalaMoviesBilling() {

		discounts = new ArrayList<Discounts>();
		discounts.add(new DiscountOldUser());
		discounts.add(new DiscountPayPal());
	}
	
	public void charge(User user) {
		double amount = calculateAmount(user);
		
		for (CommunicationChannel channel : user.getChannels()) {
			channel.conctactUser(user, "Dear user this month we have an amount to collect of: " + amount);
		}
	}

	public double calculateAmount(User user) {
		
		double amount = user.getSubscription().getPrize();
		
		for (Discounts discount : user.getDisucounts()) {
			
			amount -= discount.getDiscountAmount(user);
		}
		
		return amount;
	}
	
}
