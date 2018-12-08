package com.uala.uala_movies.subscriptions;

import com.uala.uala_movies.model.users.User;

public abstract class Subscription {

	private double prize;
	
	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}
	
	// Otra opcion seria implementar aca el metodo y solo sobreescribir el limite
	public abstract boolean canLogin(User user);
}
