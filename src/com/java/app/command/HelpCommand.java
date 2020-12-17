package com.java.app.command;

import java.io.IOException;

public class HelpCommand extends ChatCommand{
@Override
public void execute(String[] line) throws IOException {
	// TODO Auto-generated method stub
	ps.println("follow the :: pattern");
	ps.println("pattern length must me more than or equals to 2");
	
	ps.println("1.list=>to list the peoples online");
	ps.println("2.logout=> to logout");
	ps.println("3.pm=>to send private message: eg. pm::username::message");
	ps.println("4.autoreply=> eg, autotoreply::your message");
	ps.println("5.autoreply/=> to unset autoreply");
	ps.println("6.block=> eg, block::username");
	ps.println("7.unblock=> eg, unblock::username");
	ps.println("8.profile=> to check user profile, eg, profile::username");
	ps.println("9.private-p=> to set your profile private eg, private-p");
	ps.println("10.private-p/=> to unset your profile private eg, private-p/");

	
}
}
