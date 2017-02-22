package br.com.gch.back.soap.ws.service;

import java.util.Date;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import br.com.gch.back.soap.ws.dao.LoginDao;
import br.com.gch.back.soap.ws.model.Usuario;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public class WebMethodService {

	@Inject
	private LoginDao dao;

	@WebMethod(operationName="BuscarUsuario")
	@WebResult(name="usuario")
	public Usuario buscarUsuario(@WebParam(name="indAcesso") String indAcesso,
								 @WebParam(name="cpf") String cpf, 
								 @WebParam(name="dtNascimento") Date dtNascimento
								 ){
		
		System.out.println("Buscando Usuario...");
		Usuario usuario = dao.buscarUsuario(indAcesso, cpf, dtNascimento);		
		return usuario;		
	}
}
