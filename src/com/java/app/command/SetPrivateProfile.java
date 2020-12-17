package com.java.app.command;

import java.io.IOException;

public class SetPrivateProfile  extends ChatCommand{
 @Override
public void execute(String[] line) throws IOException {
	// TODO Auto-generated method stub
	 if(line.length>0) {
		 client.setPrivateProfile();
		 ps.println("you have set your profile private");
	 }else {
		 ps.println("pattern didnt match");
	 }
	
}
}
