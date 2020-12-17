package com.java.app.command.factory;

import com.java.app.command.AutoReply;
import com.java.app.command.BlockUser;
import com.java.app.command.ChatCommand;
import com.java.app.command.HelpCommand;
import com.java.app.command.ListCommand;
import com.java.app.command.LogoutCommand;
import com.java.app.command.PrivateMsgCommand;
import com.java.app.command.RemoveAutoReply;
import com.java.app.command.SetPrivateProfile;
import com.java.app.command.UnblockUser;
import com.java.app.command.UnsetPrivateProfile;
import com.java.app.command.UserProfile;


public class CommandFactory {

	public static ChatCommand getCommand(String command) {
		switch(command) {
		case "autoreply":
			return new AutoReply();
		case "autoreply/":
			return new RemoveAutoReply();
		case "private-p":
			return new SetPrivateProfile();
		case "private-p/":
			return new UnsetPrivateProfile();
		case "profile":
			return new UserProfile();
		case "help":
			return new HelpCommand();
		case "list":
			return new ListCommand();
		case "block":
			return new BlockUser();
		case "unblock":
			return new UnblockUser();
			
		case "logout":
			return new LogoutCommand();
			
		case "pm":
			return new PrivateMsgCommand();
//			default :
//				return new NullCommandException();
		}
		
		return null;
	}
	
	
	
}
