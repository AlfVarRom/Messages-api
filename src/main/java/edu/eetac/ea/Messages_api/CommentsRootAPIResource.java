package edu.eetac.ea.Messages_api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import edu.eetac.ea.Messages_api.modelos.CommentsRootAPI;






@Path("/")
public class CommentsRootAPIResource {

	@GET
	public CommentsRootAPI getRootAPI() {
		CommentsRootAPI api = new CommentsRootAPI();
		return api;
	}
	
}
