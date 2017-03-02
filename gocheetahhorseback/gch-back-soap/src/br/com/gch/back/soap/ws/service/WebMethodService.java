package br.com.gch.back.soap.ws.service;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import br.com.gch.back.soap.ws.dao.LoginDao;
import br.com.gch.back.soap.ws.model.LoginEntrada;
import br.com.gch.back.soap.ws.model.LoginSaida;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public class WebMethodService {

	@Inject
	private LoginDao dao;

	@WebMethod(operationName="logar")
	@WebResult(name="usuario")
	public LoginSaida logar(@WebParam(name="loginEntrada") LoginEntrada loginEntrada
								 ){		
		System.out.println("Buscando Usuario...");
		LoginSaida usuario = dao.logar(loginEntrada.getIndAcesso(), loginEntrada.getCpf(), loginEntrada.getDtNascimento());		
		return usuario;		
	}
}
