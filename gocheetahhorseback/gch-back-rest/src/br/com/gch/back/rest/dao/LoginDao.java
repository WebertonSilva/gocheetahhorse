package br.com.gch.back.rest.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import br.com.gch.back.rest.model.Usuario;


public class LoginDao {
	private static Map<String, Usuario> banco = new HashMap<String, Usuario>();

	static {

		Usuario leanne = new Usuario("1", "38961873091", "Leanne Graham", "Sincere@april.biz", new Date(315543600000l), "Kulas Light",
				-37.3159, 81.1496);

		Usuario ervin = new Usuario("2", "56345362271", "Ervin Howell", "Shanna@melissa.tv", new Date(315543600000l), "Victor Plains",
				-43.9509, -34.4618);

		Usuario elementine = new Usuario("3", "22666755592", "Clementine Bauch", "Shanna@melissa.tv", new Date(315543600000l),
				"Douglas Extension", -68.6102, -47.0653);

		Usuario patricia = new Usuario("4", "75633818725", "Patricia Lebsack", "Julianne.OConner@kory.org", new Date(315543600000l),
				"Hoeger Mall", 29.4572, -164.2990);

		Usuario chelsey = new Usuario("5", "30730365638", "Chelsey Dietrich", "Lucio_Hettinger@annie.ca", new Date(315543600000l),
				"Skiles Walks", -31.8129, -62.5342);

		banco.put(leanne.getCpf(), leanne);
		banco.put(ervin.getCpf(), ervin);
		banco.put(elementine.getCpf(), elementine);
		banco.put(patricia.getCpf(), patricia);
		banco.put(chelsey.getCpf(), chelsey);
	}

	public Usuario buscarUsuario(String idCia, String id, Date dtNascimento) {		
		Usuario usuario = banco.get(id);
		
		
		if(idCia.equals("2") && usuario.getDtNascimento().compareTo(dtNascimento) == 0){
			return usuario;
		}
		else if(idCia.equals("1") || idCia.equals("3") || idCia.equals("4") || idCia.equals("5")){
			return usuario;
		}else{
			return null;
		}		
	}
}
