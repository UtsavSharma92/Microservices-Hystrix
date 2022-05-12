package com.app.contactservice.serviceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.app.contactservice.entity.Contact;
import com.app.contactservice.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	public List<Contact> getContactDetails(Integer userId) {

		List<Contact> contactList = Arrays.asList(new Contact(21, "John Wick", 1), new Contact(22, "Whatever", 2),
				new Contact(23, "Dragon Born", 3), new Contact(25, "Ezio", 1), new Contact(30, "Creed", 2));

		return contactList.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());

	}

}
