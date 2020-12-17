package com.java.app.userFeature;

import com.java.app.CLientHandler;
import com.java.app.Client;

public class UserFeature {

	public static int userOnline() {
		int size=Client.count()-CLientHandler.count();
		return size;
	}
	
}
