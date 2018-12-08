package com.uala.uala_movies.login;

import com.uala.uala_movies.model.users.User;

public class UalaMoviesLogin {

	public boolean login(User user) {

		boolean login = false;

		if (user.getSubscription().canLogin(user)) {

			user.setPeopleOnline(user.getPeopleOnline() + 1);
			login = true;
		}

		return login;
	}
}
