package com.uala.uala_movies.model.users.builder;

import com.uala.uala_movies.model.discounts.Discounts;
import com.uala.uala_movies.model.products.Product;
import com.uala.uala_movies.model.users.User;
import com.uala.uala_movies.subscriptions.Subscription;

public class UserBuilder {

	private User user;
	
	public UserBuilder() {
		user = new User();
	}
	
	public User build() {
		return user;
	}
	
	public UserBuilder watching(Product product) {
		user.setWatching(product);
		return this;
	}
	
	public UserBuilder withSubscription(Subscription subscription) {
		user.setSubscription(subscription);
		return this;
	}
	
	public UserBuilder withDiscount(Discounts discounts) {
		user.addDiscount(discounts);
		return this;
	}
	
	public UserBuilder withPeopleOnline(int peopleOnline) {
		user.setPeopleOnline(peopleOnline);
		return this;
	}
}
