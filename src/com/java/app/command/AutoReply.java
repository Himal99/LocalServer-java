package com.java.app.command;

import java.io.IOException;

public class AutoReply extends ChatCommand {
@Override
public void execute(String[] line) throws IOException {
	// TODO Auto-generated method stub
	
	if(line.length>1) {
		client.setAutoReply(line[1]);
		ps.println("autoreply successfully saved");
	}
	else {
		ps.println("pattern didnt match");
	}
	
}
}
