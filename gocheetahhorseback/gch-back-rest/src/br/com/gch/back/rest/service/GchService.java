package br.com.gch.back.rest.service;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
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
public class GchService {
	
	Barramento port = new Barramento(); 
	
	/**
	 * Login realizado pelo CheetahHorse BB
	 */
	@POST
	@Path("loginCheetahHorseBB")
	@Consumes(MediaType.APPLICATION_JSON)	
	public Response logarCheetahHorseBB(Login login){
		
		try {
			System.out.println("Checagem de usuário no WebMethodService");
			
			GregorianCalendar gregory = new GregorianCalendar();
			gregory.setTime(new Date(login.getDataNascimento()));

			XMLGregorianCalendar dealCloseDate = DatatypeFactory.newInstance()
			.newXMLGregorianCalendar(gregory);
			
			Usuario usuario = port.getPort().buscarUsuario(login.getCodCia(), login.getCpf(),dealCloseDate);
			if (usuario != null) {
				System.out.println("Geração de JWT para Segurado CheetahHorseBB");
				String compactJws = JwtToken.generateToken(login);
				return Response.ok().header("jwt", compactJws ).build();
			} else {
				return Response.status(Status.UNAUTHORIZED).build();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Status.UNAUTHORIZED).build();
		}
	}
}
