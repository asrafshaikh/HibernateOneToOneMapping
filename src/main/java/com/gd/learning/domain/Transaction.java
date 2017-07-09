package com.gd.learning.domain;

import java.util.Date;

public class Transaction {
	private long id;
	private Date date;
	private double total;
	private User user;

	@Override
	public String toString() {
		return id + ", " + total + ", " + user.getUsername() + ", " + user.getEmail();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public User getuser() {
		return user;
	}

	public void setuser(User user) {
		this.user = user;
	}

}
