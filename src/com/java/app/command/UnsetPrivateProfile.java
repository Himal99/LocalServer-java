package com.java.app.command;

import java.io.IOException;

public class UnsetPrivateProfile extends ChatCommand {

	@Override
	public void execute(String[] line) throws IOException {
		// TODO Auto-generated method stub
		if(line.length>0) {
			 client.unsettPrivateProfile();
			 ps.println("you have unset your profile private");
		 }else {
			 ps.println("pattern didnt match");
		 }
		
	}
}
