package br.com.gch.back.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.gch.back.rest.model.Login;


@Path("/")
public class GchService {
	
	@GET
	@Path("consultar")
	@Produces(MediaType.APPLICATION_JSON)
	public Response consultar(){
		return Response.ok().entity(new Login("1111111")).build();
	}

}
