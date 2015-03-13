package edu.eetac.ea.Messages_api;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import edu.eetac.ea.Messages_api.modelos.CommentsError;



public class WebApplicationExceptionMapper implements
ExceptionMapper<WebApplicationException> {
@Override
public Response toResponse(WebApplicationException exception) {
CommentsError error = new CommentsError(
		exception.getResponse().getStatus(), exception.getMessage());
return Response.status(error.getStatus()).entity(error)
		.type(MediaType.COMMENTS_API_ERROR).build();
}

}
