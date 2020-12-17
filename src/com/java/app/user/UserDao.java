package com.java.app.user;

import java.util.List;

public interface UserDao {

	public List<User> getAllUser();
	public User login(String username,String password);
	public void insertUser(User user);
	
		
}
