package br.com.gch.back.ws.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.Stateless;

import br.com.gch.back.soap.ws.model.Usuario;

@SuppressWarnings("deprecation")
@Stateless
public class LoginDao {
	
	static Date date = new Date();
	
	static{
		System.out.println("setando data");
		date.setYear(2000);
		date.setMonth(01);
		date.setDate(01);
		System.out.println(date);
	}
	
	
	private static Map<String, Usuario> banco = new HashMap<String, Usuario>();
	
	static {
		
		Usuario leanne = new Usuario("1","38961873091","Leanne Graham","Sincere@april.biz", date, "Kulas Light", -37.3159, 81.1496);

		Usuario ervin = new Usuario("2","56345362271","Ervin Howell","Shanna@melissa.tv", date , "Victor Plains", -43.9509, -34.4618);

		Usuario elementine = new Usuario("3","22666755592","Clementine Bauch","Shanna@melissa.tv", date, "Douglas Extension", -68.6102, -47.0653);

		Usuario patricia = new Usuario("4","75633818725","Patricia Lebsack","Julianne.OConner@kory.org", date, "Hoeger Mall", 29.4572, -164.2990);

		Usuario chelsey = new Usuario("5","30730365638","Chelsey Dietrich","Lucio_Hettinger@annie.ca", date, "Skiles Walks", -31.8129, -62.5342);

		
		
		banco.put(leanne.getCodCpfCnpj(), leanne);
		banco.put(ervin.getCodCpfCnpj(), ervin);
		banco.put(elementine.getCodCpfCnpj(), elementine);
		banco.put(patricia.getCodCpfCnpj(), patricia);
		banco.put(chelsey.getCodCpfCnpj(), chelsey);
	}	
	
	public Usuario buscarUsuario(String id){		
		
		return banco.get(id);
	}

}
