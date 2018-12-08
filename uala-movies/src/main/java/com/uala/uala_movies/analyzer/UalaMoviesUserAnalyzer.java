package com.uala.uala_movies.analyzer;

import com.uala.uala_movies.model.users.User;

public class UalaMoviesUserAnalyzer {

	public boolean isWatchingSomethingInteresting(User user) {
		return user.getWatching().isItInteresting();
	}
}
