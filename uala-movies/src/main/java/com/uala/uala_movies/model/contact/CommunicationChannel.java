package com.uala.uala_movies.model.contact;

import com.uala.uala_movies.model.users.User;

public abstract class CommunicationChannel {

	public abstract void conctactUser(User user, String message);
}
