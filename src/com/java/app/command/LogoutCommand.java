package com.java.app.command;

import java.io.IOException;
import java.io.PrintStream;

import com.java.app.Client;

public class LogoutCommand extends ChatCommand {
@Override
public void execute(String[] line) throws IOException {
	// TODO Auto-generated method stub
for(Client c:handler.getClients()) {
		
		
		if(handler.currentCline(c)==client) {
			ps.println("You have been Logged out");
		}
		else {
			PrintStream ps2=new PrintStream(c.getSocket().getOutputStream());
			ps2.println("("+client.getUser().getUsername()+")"+" has left the room");
		}
		
		
	
	}
	socket.close();
	handler.removeClient(client);
	
}
}
