package com.java.app.userloader;

import com.java.app.user.User;
import com.java.app.user.UserDao;
import com.java.app.user.UserDetail;

public class UserLoader {

	public static void loadUser(UserDao dao) {
		UserDetail himal = new UserDetail("ktm", "22", "9816394533", "bantawaheem35@gmail", "bachelor BCA");
		UserDetail ram = new UserDetail("pkr", "20", "9816394533", "ram@gmail", "bachelor BCA");
		UserDetail sita = new UserDetail("drn", "18", "9816394533", "sita@gmail", "bachelor BCA");

		dao.insertUser(new User("himal", "admin123", himal));
		dao.insertUser(new User("ram", "admin123", ram));
		dao.insertUser(new User("sita", "admin123", sita));
	}
}
