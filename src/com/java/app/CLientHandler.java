package com.java.app;

import java.util.ArrayList;
import java.util.List;

public class CLientHandler {
	
	private static CLientHandler handler=null;
	
	private CLientHandler(){
		
	}
	
	public static  CLientHandler getInstance() {
	
		if(handler==null) {
			
				handler=new CLientHandler();
			
			
		}
		return handler;
	}

	private static List<Client> clientlist=new ArrayList<>();
	
	
	public void addclient(Client client) {
		clientlist.add(client);
	}
	
	public List<Client> getClients(){
		return clientlist;
	}
	
	public Client currentCline(Client client){
		return client;
		
	}
	
	public static int count() {
		return clientlist.size();
	}
	
	public void removeClient(Client client) {
		clientlist.remove(client);
	}
	
	public Client getByUsername(String username) {
		for(Client c:clientlist) {
			if(c.getUser().getUsername().equalsIgnoreCase(username)) {
				return c;
			}
		}
		return null;
	
	}
	
	
	
}
