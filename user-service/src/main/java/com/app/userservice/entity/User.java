package com.app.userservice.entity;

import java.util.ArrayList;
import java.util.List;

public class User {

	private Integer userId;

	private String userName;

	private Integer phone;

	private List<Contact> userContact = new ArrayList<>();

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public List<Contact> getUserContact() {
		return userContact;
	}

	public void setUserContact(List<Contact> userContact) {
		this.userContact = userContact;
	}

	public User(int userId, String userName, int phone) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.phone = phone;
	}

}
