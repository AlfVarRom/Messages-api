package edu.eetac.ea.Messages_api.modelos;

import java.util.HashMap;


public class UserCollection {
	
	private HashMap<String, User> users;

	public UserCollection() {
		super();
		users = new HashMap<String, User>();
	}

	public HashMap<String, User> getUsers() {
		return users;
	}

	public void setUsers(HashMap<String, User> users) {
		this.users = users;
	}

}
