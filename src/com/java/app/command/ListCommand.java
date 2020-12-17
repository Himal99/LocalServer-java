package com.java.app.command;

import java.io.IOException;
import java.io.PrintStream;

import com.java.app.Client;
import com.java.app.userFeature.UserFeature;

public class ListCommand extends ChatCommand {
@Override
public void execute(String[] line) throws IOException {
	// TODO Auto-generated method stub
	StringBuilder content=new StringBuilder();

	content.append("==People online==\r\n");
	for(Client c:handler.getClients()) {
		if(!c.hasBlock(client)) {
			content.append(c.getUser().getUsername());
			if(client.hasBlock(c)) {
				content.append("(blocked)");
			}
			if(c.getUser().getUsername().equals(client.getUser().getUsername())){
				content.append("(me)");
			}
			content.append("\r\n");
		}
	}
	ps.println(content);
	
}
}
