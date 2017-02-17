package br.com.gch.back.soap.ws.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.Stateless;
import javax.xml.datatype.XMLGregorianCalendar;

import br.com.gch.back.soap.utils.DateUtils;
import br.com.gch.back.soap.ws.model.Usuario;

@Stateless
public class LoginDao {

	private static Map<String, Usuario> banco = new HashMap<String, Usuario>();

	static {
		Date dataNascimento = null;
		try {
			dataNascimento = getDate(1980, 01, 01);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(dataNascimento);
		XMLGregorianCalendar date = DateUtils.toXmlGregorianCalendar(dataNascimento);

		Usuario leanne = new Usuario("1", "38961873091", "Leanne Graham", "Sincere@april.biz", date, "Kulas Light",
				-37.3159, 81.1496);

		Usuario ervin = new Usuario("2", "56345362271", "Ervin Howell", "Shanna@melissa.tv", date, "Victor Plains",
				-43.9509, -34.4618);

		Usuario elementine = new Usuario("3", "22666755592", "Clementine Bauch", "Shanna@melissa.tv", date,
				"Douglas Extension", -68.6102, -47.0653);

		Usuario patricia = new Usuario("4", "75633818725", "Patricia Lebsack", "Julianne.OConner@kory.org", date,
				"Hoeger Mall", 29.4572, -164.2990);

		Usuario chelsey = new Usuario("5", "30730365638", "Chelsey Dietrich", "Lucio_Hettinger@annie.ca", date,
				"Skiles Walks", -31.8129, -62.5342);

		banco.put(leanne.getCodCpfCnpj(), leanne);
		banco.put(ervin.getCodCpfCnpj(), ervin);
		banco.put(elementine.getCodCpfCnpj(), elementine);
		banco.put(patricia.getCodCpfCnpj(), patricia);
		banco.put(chelsey.getCodCpfCnpj(), chelsey);
	}

	public Usuario buscarUsuario(String idCia, String id, Date dtNascimento) {		
		Usuario usuario = banco.get(id);
		
		
		if(idCia.equals("2") && usuario.getDtNascimento().compare(DateUtils.toXmlGregorianCalendar(dtNascimento)) == 0){
			return usuario;
		}
		else if(idCia.equals("1")){
			return usuario;
		}else{
			return null;
		}		
	}

	public static Date getDate(int y, int m, int d) throws ParseException {
		int year = y;
		int month = m;
		int day = d;

		String date = year + "/" + month + "/" + day;
		java.util.Date utilDate = null;

		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
			utilDate = formatter.parse(date);
			System.out.println("utilDate:" + utilDate);
		} catch (ParseException e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return utilDate;

	}

}
