package com.app.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.app.userservice.entity.Contact;
import com.app.userservice.entity.User;
import com.app.userservice.service.UserService;
import com.app.userservice.serviceImpl.UserServiceImpl;

@RestController
public class UserController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping(value = "/user/getUserDetails/{userId}")
	public User getUserDetailsController(@PathVariable Integer userId) {

		UserService userServiceImpl = new UserServiceImpl();

		System.out.println("Got request for user id:" + userId);

		User user = userServiceImpl.getUserDetails(userId);

		List<Contact> contactDetails = restTemplate
				.getForObject("http://contact-service/contact/getContactDetails/" + userId, List.class);

		user.setUserContact(contactDetails);

		// http://localhost:9002/contact/getContactDetails/1

		return user;

	}

}
