package com.uala.uala_movies.model.users;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.uala.uala_movies.model.contact.CommunicationChannel;
import com.uala.uala_movies.model.discounts.Discounts;
import com.uala.uala_movies.model.products.Product;
import com.uala.uala_movies.subscriptions.Subscription;

public class User {

	private Subscription subscription;
	
	private Product watching;
	
	private Date accountCreationDate;
	
	private List<Discounts> discounts;
	
	private List<CommunicationChannel> channels;
	
	private int peopleOnline;
	
	public User() {
		discounts = new ArrayList<Discounts>();
		channels = new ArrayList<CommunicationChannel>();
	}
	
	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	public Product getWatching() {
		return watching;
	}

	public void setWatching(Product watching) {
		this.watching = watching;
	}

	public Date getAccountCreationDate() {
		return accountCreationDate;
	}

	public void setAccountCreationDate(Date accountCreationDate) {
		this.accountCreationDate = accountCreationDate;
	}

	public List<Discounts> getDisucounts() {
		return discounts;
	}

	public void setDisucounts(List<Discounts> disucounts) {
		this.discounts = disucounts;
	}

	public void addDiscount(Discounts discount) {
		this.discounts.add(discount);
	}
	
	public int getPeopleOnline() {
		return peopleOnline;
	}

	public void setPeopleOnline(int peopleOnline) {
		this.peopleOnline = peopleOnline;
	}
	
	public void addChannel(CommunicationChannel channel) {
		channels.add(channel);
	}
	
	public void removeChannel(CommunicationChannel channel) {
		channels.remove(channel);
	}

	public List<CommunicationChannel> getChannels() {
		return channels;
	}
	
}
