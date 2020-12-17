package com.java.app.command;

import java.io.IOException;
import java.io.PrintStream;

import com.java.app.Client;

public class PrivateMsgCommand extends ChatCommand {
@Override
public void execute(String[] line) throws IOException {
	// TODO Auto-generated method stub
	

		Client pvtclient=handler.getByUsername(line[1]);
		if(pvtclient!=null) {
			if(pvtclient==client) {
				ps.println("you cant private message yourself");
			}
			else if(pvtclient.getAutoReply()!=null){
				ps.println("[autoreply from "+pvtclient.getUser().getUsername()+"] :"+pvtclient.getAutoReply());
			}
			else if(!client.hasBlock(pvtclient)&& !pvtclient.hasBlock(client)) {
			PrintStream ps=new PrintStream(pvtclient.getSocket().getOutputStream());
			ps.println("private message from :"+"["+client.getUser().getUsername()+"]"+": "+line[2]);
		}
		}
		else {
			ps.println("no user found with name :"+ line[1]);
		}
		
}
}
