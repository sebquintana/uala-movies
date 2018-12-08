package com.uala.uala_movies.subscriptions;

import com.uala.uala_movies.model.users.User;

public class Premium extends Subscription {

	private static final int LIMIT_PEOPLE_ONLINE = 6;

	@Override
	public boolean canLogin(User user) {
		return user.getPeopleOnline() < LIMIT_PEOPLE_ONLINE;
	}
}
