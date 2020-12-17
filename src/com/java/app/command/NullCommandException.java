package com.java.app.command;

import java.io.IOException;
import java.io.PrintStream;

public class NullCommandException extends ChatCommand {
@Override
public void execute(String[] line) throws IOException {
	// TODO Auto-generated method stub
	if(line.length>1) {
	PrintStream ps=new PrintStream(client.getSocket().getOutputStream());
	ps.println("Pattern didn't matched");
	}
}
}
