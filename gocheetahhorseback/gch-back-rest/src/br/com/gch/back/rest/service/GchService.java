package br.com.gch.back.rest.service;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.gch.back.rest.dao.LoginDao;
import br.com.gch.back.rest.jjwt.JwtToken;
import br.com.gch.back.rest.model.Login;
import br.com.gch.back.rest.model.Usuario;


@Path("/")
public class GchService {

	LoginDao dao = new LoginDao();
	
	/**
	 * Login realizado pelo CheetahHorse BB
	 */
	@POST
	@Path("login")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response logarCheetahHorseBB(Login login){
		
		try {
			System.out.println("Checagem de usuário no WebMethodService");
			
			System.out.println(new Date(login.getDataNascimento()));
			System.out.println(new Date(login.getDataNascimento()).getTime());
			Usuario usuario = dao.buscarUsuario(login.getIndAcesso(), login.getCpf(), new Date(login.getDataNascimento()));
			if (usuario != null) {
				System.out.println("Geração de JWT para Segurado CheetahHorseBB");
				String compactJws = JwtToken.generateToken(login);
				return Response.ok().entity(usuario).header("jwt", compactJws ).build();
			} else {
				return Response.status(Status.UNAUTHORIZED).build();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Status.UNAUTHORIZED).build();
		}
	}
}
