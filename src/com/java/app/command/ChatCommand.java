package com.java.app.command;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

import com.java.app.CLientHandler;
import com.java.app.Client;

public abstract class ChatCommand {

	protected Client client;
	protected Socket socket;
	protected PrintStream ps;
	protected CLientHandler handler=CLientHandler.getInstance();
	abstract  public void execute(String[] line) throws IOException;
	
	
	public ChatCommand setClient(Client client) {
		this.client = client;
		return this;
	}
	
	public ChatCommand setPs(PrintStream ps) {
		this.ps = ps;
		return this;
	}
	
	public ChatCommand setSocket(Socket socket) {
		this.socket=socket;
		return this;
	}
	
}
