package br.com.gocheetahorse.sb.rest;

import java.security.Key;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.gocheetahhorse.sb.jjwt.JwtToken;
import br.com.gocheetahhorse.sb.model.Login;
import io.jsonwebtoken.impl.crypto.MacProvider;

@Path("/")
public class LoginREST {
		
	public static Key key = MacProvider.generateKey();
	
	/**
	 * Login realizado pelo CheetahHorse BB
	 */
	
	@Path("loginCheetahHorseBB")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)	
	public Response logarCheetahHorseBB(Login login){
		try {
			System.out.println("Geração de JWT para Segurado CheetahHorseBB");
			String compactJws = JwtToken.generateToken(login);
			return Response.ok().header("jwt", compactJws ).build();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	//
	@Path("consultar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response consultar(){
		System.out.println("Consultando login");
		Login login = new Login();
		login.setCpf("1111111111");			
		return Response.ok().entity(login).build();		
	}
	
	/**
	 * Login realizado pelo CheetahHorse Seguros
	 */
	@Path("loginCheetahHorseSeguros")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response logarCheetahHorseSeguros(Login login){
		System.out.println("checagem de JWT para CheetahHorseSeguros");
		
		if (JwtToken.verifyToken(login.getJwt()))
			return Response.ok().header("nome", "Joao").build();
		else
			return Response.status(Status.UNAUTHORIZED).build();
	}
	
	/**
	 * Login realizado pelo Corretor
	 */
	@Path("loginCheetahHorseCorretor")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response logarCheetahHorseCorretor(Login login){
		if (JwtToken.verifyToken(login.getJwt()))
			return Response.ok().header("nome", "Maria").build();
		else
			return Response.status(Status.UNAUTHORIZED).build();
	}
	
	/**
	 * Login realizado pelo Call Center
	 */
	@Path("loginCheetahHorseCallCenter")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response logarCheetahHorseCallCenter(Login login){
		if (JwtToken.verifyToken(login.getJwt()))
			return Response.ok().header("nome", "Ze").build();
		else
			return Response.status(Status.UNAUTHORIZED).build();
	}
}
