package com.java.app.user;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

	private List<User> userlist=new ArrayList<>();
	
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userlist;
	}

	@Override
	public User login(String username, String password) {
		for(User u:userlist) {
			if(username.equalsIgnoreCase(u.getUsername())&&password.equalsIgnoreCase(u.getPassword())) {
				return u;
			}
		}
		return null;
	}

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		userlist.add(user);
		
	}

}
