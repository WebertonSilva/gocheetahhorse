package br.com.gch.back.rest.service;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.gch.back.rest.dao.SeguradoDao;
import br.com.gch.back.rest.dao.LoginDao;
import br.com.gch.back.rest.jjwt.JwtToken;
import br.com.gch.back.rest.model.Segurado;
import br.com.gch.back.rest.model.Login;
import br.com.gch.back.rest.model.Usuario;
import br.com.gch.back.rest.model.ValidaSegurado;


@Path("/")
public class GchService {

	private LoginDao loginDao = new LoginDao();
	private SeguradoDao seguradoDao = new SeguradoDao();
	
	/**
	 * Login
	 */
	@POST
	@Path("login")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response logar(Login login){
		
		try {
			System.out.println("Checagem de usuário no WebMethodService");
			Usuario usuario = loginDao.buscarUsuario(login.getIndAcesso(), login.getCpf(), new Date(login.getDtNascimento()));
			if (usuario != null) {
				System.out.println("Geração de JWT");
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
	
	/**
	 * Validação se o segurado corresponde pelo usuário
	 */
	@POST
	@Path("validacao")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response validar(ValidaSegurado validaSegurado){
		
		try {
			System.out.println("Checagem de segurado no WebMethodService");
			Segurado seguradoRecuperado = seguradoDao.validarSegurado(validaSegurado.getCpfSegurado(), validaSegurado.getCpfFuncResponsavel());
			if (seguradoRecuperado != null) {
				System.out.println("Validação de JWT");
				if (JwtToken.verifyToken(validaSegurado.getJwttokenFuncResponsavel()))
					return Response.ok().entity(seguradoRecuperado).build();
				else
					return Response.status(Status.UNAUTHORIZED).build();
			} else {
				return Response.status(Status.NO_CONTENT).build();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Status.UNAUTHORIZED).build();
		}
	}
}
