package edu.eetac.ea.Messages_api;

import java.util.List;

import edu.eetac.ea.Messages_api.modelos.Message;
import edu.eetac.ea.Messages_api.modelos.MessageCollection;
import edu.eetac.ea.Messages_api.modelos.User;
import edu.eetac.ea.Messages_api.modelos.UserCollection;


public interface Manager {
	
	public UserCollection users = new UserCollection();
	
	
	public User createUser(User user);
	
	public User updateUser(String username, User user);
	
	public UserCollection getUsers();
	
	public void deleteUser(String username);
	
	
	public List <User> usersByMessages();
	
	public Message addMessage(String username, Message message);
	
	public Message updateMessage(String username, int commentid, Message message);
	
	public MessageCollection getMessagesByUser(String username);
	
	public void deleteMessage(String username, int commentid);
	
}
