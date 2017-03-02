package br.com.gch.back.soap.ws.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.Stateless;
import javax.xml.datatype.XMLGregorianCalendar;

import br.com.gch.back.soap.utils.DateUtils;
import br.com.gch.back.soap.ws.model.LoginSaida;

@Stateless
public class LoginDao {

	private static Map<String, LoginSaida> banco = new HashMap<String, LoginSaida>();

	static {
		XMLGregorianCalendar date = DateUtils.toXmlGregorianCalendar(new Date(315543600000l));

        String perfilSeguradoCheetah = "1";
        String perfilSeguradoHorse = "2";
        String perfilCorretor = "3";
        String perfilCallCenterCheetah = "4";
        String perfilCallCenterHorse = "5";

        LoginSaida leanne = new LoginSaida("1", "38961873091", "Leanne Graham", "Sincere@april.biz", date,
                      "Kulas Light", -37.3159, 81.1496, perfilSeguradoCheetah);

        LoginSaida ervin = new LoginSaida("2", "56345362271", "Ervin Howell", "Shanna@melissa.tv", date,
                      "Victor Plains", -43.9509, -34.4618, perfilSeguradoCheetah);

        LoginSaida elementine = new LoginSaida("3", "22666755592", "Clementine Bauch", "Shanna@melissa.tv",
        		date, "Douglas Extension", -68.6102, -47.0653, perfilSeguradoHorse);

        LoginSaida patricia = new LoginSaida("4", "75633818725", "Patricia Lebsack", "Julianne.OConner@kory.org",
        		date, "Hoeger Mall", 29.4572, -164.2990, perfilSeguradoHorse);

        LoginSaida chelsey = new LoginSaida("5", "30730365638", "Chelsey Dietrich", "Lucio_Hettinger@annie.ca",
        		date, "Skiles Walks", -31.8129, -62.5342, perfilCorretor);

        LoginSaida bill = new LoginSaida("6", "16480376668", "Bill Gates", "bill_gates@microsoft.com",
        		date, "Fifth Avenue", 32.567, -65.3478, perfilCorretor);

        LoginSaida steve = new LoginSaida("7", "34209374741", "Steve Jobs", "steve_jobs@apple.com", date,
                      "Cupertino Street", 28.6789, -50.7653, perfilCallCenterCheetah);

        LoginSaida mark = new LoginSaida("8", "89775811848", "Mark Zuckerberg", "mark_zuck@facebook.com",
        		date, "Palo Alto Avenue", 30.6219, -67.4569, perfilCallCenterCheetah);

        LoginSaida james = new LoginSaida("9", "63177531307", "James Gosling", "james_gosling@java.com",
        		date, "Calgary Street", -32.3456, 85.9614, perfilCallCenterHorse);

        LoginSaida larry = new LoginSaida("10", "78272656850", "Larry Page", "larry_page@google.com",
        		date, "Michigan Blvd", 23.4589, -161.3030, perfilCallCenterHorse);

        banco.put(leanne.getCpf(), leanne);
        banco.put(ervin.getCpf(), ervin);
        banco.put(elementine.getCpf(), elementine);
        banco.put(patricia.getCpf(), patricia);
        banco.put(chelsey.getCpf(), chelsey);
        banco.put(bill.getCpf(), bill);
        banco.put(steve.getCpf(), steve);
        banco.put(mark.getCpf(), mark);
        banco.put(james.getCpf(), james);
        banco.put(larry.getCpf(), larry);
	}

	public LoginSaida logar(String indAcesso, String cpf, XMLGregorianCalendar dtNascimento) {		
		LoginSaida usuario = banco.get(cpf);
        if (indAcesso.equals("2") && indAcesso.equals(usuario.getPerfilAcesso()) && usuario.getDtNascimento().compare(dtNascimento) == 0) {
               return usuario;
        } else if (indAcesso.equals("1") && indAcesso.equals(usuario.getPerfilAcesso())
                      || indAcesso.equals("3") && indAcesso.equals(usuario.getPerfilAcesso())
                      || indAcesso.equals("4") && indAcesso.equals(usuario.getPerfilAcesso())
                      || indAcesso.equals("5") && indAcesso.equals(usuario.getPerfilAcesso())) {
               return usuario;
        } else {
               return null;
        }	
        
	}
}
