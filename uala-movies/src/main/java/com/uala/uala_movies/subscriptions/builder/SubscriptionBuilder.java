package com.uala.uala_movies.subscriptions.builder;

import com.uala.uala_movies.subscriptions.Classic;
import com.uala.uala_movies.subscriptions.Gold;
import com.uala.uala_movies.subscriptions.Platinum;
import com.uala.uala_movies.subscriptions.Subscription;

public class SubscriptionBuilder {

	private Subscription subscription;

	public SubscriptionBuilder classicSubscription() {
		subscription = new Classic();
		return this;
	}

	public SubscriptionBuilder goldSubscription() {
		subscription = new Gold();
		return this;
	}

	public SubscriptionBuilder platinumSubscription() {
		subscription = new Platinum();
		return this;
	}

	public Subscription build() {
		return subscription;
	}

	public SubscriptionBuilder withPrize(double prize) {
		subscription.setPrize(prize);
		return this;
	}
}
