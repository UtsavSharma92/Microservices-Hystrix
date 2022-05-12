package com.app.contactservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.contactservice.entity.Contact;
import com.app.contactservice.service.ContactService;
import com.app.contactservice.serviceImpl.ContactServiceImpl;

@RestController
public class ContactServiceController {

	@Autowired
	private ContactService contactService;

	@GetMapping(value = "/contact/getContactDetails/{userId}")
	public List<Contact> getContactDetails(@PathVariable Integer userId) {

		contactService = new ContactServiceImpl();

		return contactService.getContactDetails(userId);

	}

}
