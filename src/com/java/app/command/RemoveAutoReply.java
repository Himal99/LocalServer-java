package com.java.app.command;

import java.io.IOException;

public class RemoveAutoReply extends ChatCommand {
@Override
public void execute(String[] line) throws IOException {
	// TODO Auto-generated method stub
	if(line.length>0 && client.getAutoReply()!=null) {
		client.removeAutoReply();
		ps.println("autoreply has been removed successfully");
	}
	else if(client.getAutoReply()==null) {
		ps.println("no any autoreply has set");
	}
	else {
		ps.println("pattern didnt match");
	}
}
}
