package com.java.app.command;

import java.io.IOException;

import com.java.app.Client;

public class UserProfile extends ChatCommand {

	@Override
	public void execute(String[] line) throws IOException {
		// TODO Auto-generated method stub
		if (line.length > 0) {

			StringBuilder content = new StringBuilder();
			Client c = handler.getByUsername(line[1]);
			if (c != null) {
				if (c != client) {

					if (!c.hasPrivateProfile()) {
						content.append("==User Details==\r\n");
						content.append("name :" + c.getUser().getUsername() + "\r\n");
						content.append("address :" + c.getUser().getUserDetail().getAddress() + "\r\n");
						content.append("email :" + c.getUser().getUserDetail().getEmail() + "\r\n");
						content.append("phone :" + c.getUser().getUserDetail().getPhone() + "\r\n");
						content.append("qualification :" + c.getUser().getUserDetail().getQualification() + "\r\n");
						ps.println(content);
					} else {
						ps.println("private profile");
					}

				} else {
					ps.println("no user found");
				}

			} else {
				if (line[1].equalsIgnoreCase("me")) {
					content.append("==You Details==\r\n");
					content.append("name :" + client.getUser().getUsername() + "\r\n");
					content.append("address :" + client.getUser().getUserDetail().getAddress() + "\r\n");
					content.append("email :" + client.getUser().getUserDetail().getEmail() + "\r\n");
					content.append("phone :" + client.getUser().getUserDetail().getPhone() + "\r\n");
					content.append("qualification :" + client.getUser().getUserDetail().getQualification() + "\r\n");
					ps.println(content);
				} else {
					ps.println("no user found");
				}
			}

		} else {
			ps.println("pattern didnt match");
		}

	}

}
