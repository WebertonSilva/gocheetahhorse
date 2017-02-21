package br.com.gch.back.rest.service;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import br.com.gch.back.rest.jjwt.JwtToken;
import br.com.gch.back.rest.model.Login;
import br.com.gch.back.rest.ws.client.Barramento;
import br.com.ghc.back.rest.ws.Usuario;


@Path("/")
public class GchService{
	
	Barramento port = new Barramento();
	
	/**
	 * Login realizado pelo CheetahHorse BB
	 */
	@POST
	@Path("loginCheetahHorseBB")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response logarCheetahHorseBB(Login login){
		
		try {
			System.out.println("Checagem de usu�rio no WebMethodService");
			
			GregorianCalendar gregory = new GregorianCalendar();
			gregory.setTime(new Date(login.getDataNascimento()));

			XMLGregorianCalendar dealCloseDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory);
			
			//Usuario usuario = port.getPort().buscarUsuario(login.getCodCia(), login.getCpf(), dealCloseDate);
			Usuario usuario = new Usuario();
			usuario.setNome("Marcos");
			usuario.setCodCpfCnpj("34578920909");
			
			if (usuario != null) {
				System.out.println("Gera��o de JWT para Segurado CheetahHorseBB");
				String compactJws = JwtToken.generateToken(login);
				return Response.ok().entity(usuario).header("jwt", compactJws).build();
			} else {
				return Response.status(Status.UNAUTHORIZED).build();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Status.UNAUTHORIZED).build();
		}
	}
	
	/**
	 * Login realizado pelo CheetahHorse Seguros - Usu�rio j� logado
	 */
	@POST
	@Path("loginCheetahHorseSeguros")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response logarCheetahHorseSeguros(Login login){
		try {
			if (login.getCpf() != null && !login.getCpf().equals("")) {
				if (JwtToken.verifyToken(login.getJwtToken())) {
					System.out.println("Checagem de JWT enviado para valida��o (loginCheetahHorseSeguros)");
					return Response.ok().header("jwt", login.getJwtToken()).build();
				} else {
					return Response.status(Status.UNAUTHORIZED).build();
				}
			} else {
				return Response.status(Status.UNAUTHORIZED).build();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Status.UNAUTHORIZED).build();
		}
	}
	
	/**
	 * Login realizado pelo Corretor CheetahHorse - Usu�rio j� logado
	 */
	@Path("loginCheetahHorseCorretor")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response loginCheetahHorseCorretor(Login login){
		try {
			if (login.getCpf() != null && !login.getCpf().equals("")) {
				System.out.println("Checagem de JWT enviado para valida��o (loginCheetahHorseCorretor)");
				if (JwtToken.verifyToken(login.getJwtToken())) {
					return Response.ok().header("jwt", login.getJwtToken()).build();
				} else {
					return Response.status(Status.UNAUTHORIZED).build();
				}
			} else {
				return Response.status(Status.UNAUTHORIZED).build();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Status.UNAUTHORIZED).build();
		}
	}
	
	/**
	 * Login realizado pelo Call Center CheetahHorse - Usu�rio j� logado
	 */
	@Path("loginCheetahHorseCallCenter")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response loginCheetahHorseCallCenter(Login login){
		try {
			if (login.getCpf() != null && !login.getCpf().equals("")) {
				System.out.println("Checagem de JWT enviado para valida��o (loginCheetahHorseCallCenter)");
				if (JwtToken.verifyToken(login.getJwtToken())) {
					return Response.ok().header("jwt", login.getJwtToken()).build();
				} else {
					return Response.status(Status.UNAUTHORIZED).build();
				}
			} else {
				return Response.status(Status.UNAUTHORIZED).build();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Status.UNAUTHORIZED).build();
		}
	}
}
