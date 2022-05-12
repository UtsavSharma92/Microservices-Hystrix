package com.app.contactservice.entity;

import java.util.ArrayList;
import java.util.List;

public class Contact {

	private Integer contactId;

	private String contactName;

	private Integer userId;

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Contact(Integer contactId, String contactName, Integer userId) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.userId = userId;
	}
	
	

}
