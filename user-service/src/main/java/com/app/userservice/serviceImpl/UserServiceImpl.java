package com.app.userservice.serviceImpl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.userservice.entity.User;
import com.app.userservice.service.UserService;

@Service
public class UserServiceImpl implements UserService {

//	List<User> userDetails = new ArrayList<>();

	List<User> userDetails = Arrays.asList(new User(1, "Utsav", 123), new User(2, "Vastu", 654),
			new User(3, "something", 942));

	public User getUserDetails(int userId) {

		return userDetails.stream().filter(userabc -> userabc.getUserId().equals(userId)).findAny().orElse(null);
	}

	public void saveUserDetails() {

	}

}
