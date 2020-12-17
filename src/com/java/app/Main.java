package com.java.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.java.app.user.User;
import com.java.app.user.UserDao;
import com.java.app.user.UserDaoImpl;
import com.java.app.userloader.UserLoader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int port=5000;
		
		System.out.println("server is running at:"+port);
		CLientHandler handler=CLientHandler.getInstance();
	
		
		UserDao dao=new UserDaoImpl();
		UserLoader.loadUser(dao);
		try {
			ServerSocket conn=new ServerSocket(port);
			
			while(true) {
				Socket socket=conn.accept();
			
				ClientListner listner=new ClientListner(socket,dao);
//				listner.setHandler(handler);
				listner.start();
				
				
			}
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
