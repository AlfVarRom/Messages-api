package edu.eetac.ea.Messages_api.modelos;

import java.util.HashMap;


public class MessageCollection {

	private HashMap<Integer, Message> comments;

	public MessageCollection() {
		super();
		comments = new HashMap<Integer, Message>();
	}

	public HashMap<Integer, Message> getComments() {
		return comments;
	}

	public void setComments(HashMap<Integer, Message> comments) {
		this.comments = comments;
	}
	
	
}
