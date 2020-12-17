package com.java.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

import com.java.app.command.ChatCommand;
import com.java.app.command.ListCommand;
import com.java.app.command.LogoutCommand;
import com.java.app.command.factory.CommandFactory;
import com.java.app.user.User;
import com.java.app.user.UserDao;
import com.java.app.user.UserDaoImpl;
import com.sun.source.tree.ContinueTree;

public class ClientListner extends Thread {

	private Socket socket;
	private CLientHandler handler=CLientHandler.getInstance();
	private Client client;
	private UserDao userDao;
	private PrintStream out;
	private BufferedReader reader;

	public CLientHandler getHandler() {
		return handler;
	}

	public void setHandler(CLientHandler handler) {
		this.handler = handler;
	}

	public ClientListner(Socket socket,UserDao userdao) {
		this.socket = socket;
		this.userDao=userdao;
		

	}

	
	@Override
	public void run() {
		try {

			login();

			while (true) {

				out.println("[me] :");

				String line = reader.readLine();
				String command[] = line.split("::");

				ChatCommand cmd = CommandFactory.getCommand(command[0]);

				if (cmd != null) {

					cmd.setClient(client).setPs(out).setSocket(socket).execute(command);

				}

				else {

					for (Client c : handler.getClients()) {
						PrintStream ps = new PrintStream(c.getSocket().getOutputStream());
						if (!client.hasBlock(c) && !c.hasBlock(client)) {
							if (handler.currentCline(c) != client) {

								ps.println("[" + client.getUser().getUsername() + "] said:" + line);
							} else {
								ps.println("You said: " + line);
							}
						}

					}
				}
			}

		} catch (IOException e) {
			// TODO: handle exception

			System.out.println(e.getMessage());
		}
	}

	public void login()throws IOException{
		while(true) {
			out = new PrintStream(socket.getOutputStream());

			out.println("Enter your username");
			 reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String username = reader.readLine();
			out.println("Enter your password");
			String password = reader.readLine();
			
			User user = userDao.login(username, password);
			if (user != null) {
				out.println("hello : " + username + " welcome to our local server, type help for more");
				client = new Client(socket, user);
				handler.addclient(client);
				for (Client c : handler.getClients()) {
					PrintStream ps = new PrintStream(c.getSocket().getOutputStream());
					if (handler.currentCline(c) != client) {
						ps.println("(" + client.getUser().getUsername() + ") Has joined the chat room");

					}
				}
				break;
		}
			else {
				out.println("something went wrong");
			}
	}
	
	

	}}
