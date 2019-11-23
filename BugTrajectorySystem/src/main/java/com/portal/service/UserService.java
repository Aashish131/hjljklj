package com.portal.service;

import java.util.List;

import com.portal.models.User;

public interface UserService {

	  public User validateUser(int id, String password) ;
	  public List<User> getAllDeveloper();
	  public List<User> getAllTester();
	  public User getUserById(int userId);
}
