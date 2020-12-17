package com.java.app.command;

import java.io.IOException;
import java.io.PrintStream;

import com.java.app.Client;

public class BlockUser extends ChatCommand {
@Override
public void execute(String[] line) throws IOException {
	// TODO Auto-generated method stub
	if(line.length>1) {
		Client c=handler.getByUsername(line[1]);
		if(c!=null&&!client.hasBlock(c)) {
			if(c==client) {
				ps.println("you cant block yourself");
			}
			else {
				client.blockUser(c);
				
				ps.println("user has successfully blocked" +"["+line[1]+"]");
				PrintStream ps2=new PrintStream(c.getSocket().getOutputStream());
				ps2.println(client.getUser().getUsername() + "has left the chat room");
				
			}
		}
		else {
			ps.println("user not found");
		}
	}
	
}
}
