package com.java.app.user;

public class UserDetail {

	private String address,age,phone,email,qualification;

	public UserDetail(String address, String age, String phone, String email, String qualification) {
		super();
		this.address = address;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.qualification = qualification;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
}
