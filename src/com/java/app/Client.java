package com.java.app;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import com.java.app.user.User;

public class Client {
private Socket socket;
private User user;

private String autoReply=null;
private boolean privateProfile=false;

public Client(Socket socket, User user) {
	this.socket=socket;
	this.user=user;
}

private static List<Client> blocklist=new ArrayList<>();

public Socket getSocket() {
	return socket;
}

public static int count() {
	return blocklist.size();
}

public void setAutoReply(String autoReply) {
	this.autoReply = autoReply;
}

public String getAutoReply() {
	return autoReply;
}

public void setSocket(Socket socket) {
	this.socket = socket;
}

public User getUser() {
	return user;
}

public void removeAutoReply() {
	autoReply=null;
}

public void setUser(User user) {
	this.user = user;
}

public void blockUser(Client client) {
	if(!hasBlock(client)) {
		blocklist.add(client);
	}
}

public void unblockUser(Client client) {
	if(hasBlock(client)) {
		blocklist.remove(client);
	}
}

public boolean hasBlock(Client client){
	for(Client c:blocklist) {
		if(c.equals(client)) {
			return true;
		}
	}
	return false;
}

public boolean hasPrivateProfile() {
	if(privateProfile) {
		return true;
	}
	return false;
}

public void setPrivateProfile() {
	if(!hasPrivateProfile()) {
		privateProfile=true;
	}
}

public void unsettPrivateProfile() {
	if(hasPrivateProfile()) {
		privateProfile=false;
	}
}

}
