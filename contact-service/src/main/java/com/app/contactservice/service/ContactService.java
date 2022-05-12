package com.app.contactservice.service;

import java.util.List;

import com.app.contactservice.entity.Contact;

public interface ContactService {

	public List<Contact> getContactDetails(Integer userId);

}
