package com.uala.uala_movies.subscriptions;

import com.uala.uala_movies.model.users.User;

public class Classic extends Subscription {

	private static final int LIMIT_PEOPLE_ONLINE = 1;

	@Override
	public boolean canLogin(User user) {
		return user.getPeopleOnline() < LIMIT_PEOPLE_ONLINE;
	}

}
