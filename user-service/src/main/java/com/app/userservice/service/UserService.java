package com.app.userservice.service;

import com.app.userservice.entity.User;

public interface UserService {

	public User getUserDetails(int userId);

	public void saveUserDetails();

}
