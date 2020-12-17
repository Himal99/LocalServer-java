package com.java.app.user;

public class User {

	private String username,password;
	private UserDetail userDetail;
	
	public User() {
		
	}

	public User(String username, String password,UserDetail userDetail) {
		
		this.username = username;
		this.password = password;
		this.userDetail=userDetail;
	}

	public UserDetail getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
