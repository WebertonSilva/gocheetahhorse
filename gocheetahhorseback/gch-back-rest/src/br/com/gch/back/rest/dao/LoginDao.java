package br.com.gch.back.rest.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import br.com.gch.back.rest.model.Usuario;

public class LoginDao {
       private static Map<String, Usuario> banco = new HashMap<String, Usuario>();
       
       static {
    	   	   
               long dataNascimento = 315543600000l;

               String perfilSeguradoCheetah = "1";
               String perfilSeguradoHorse = "2";
               String perfilCorretor = "3";
               String perfilCallCenterCheetah = "4";
               String perfilCallCenterHorse = "5";
               
               
               String empresaCheetah = "Cheetah";
               String empresaHorse = "Horse";

               Usuario leanne = new Usuario("1", "38961873091", "Leanne Graham", "Sincere@april.biz", new Date(dataNascimento),
                             "Kulas Light", -37.3159, 81.1496, perfilSeguradoCheetah, empresaCheetah);

               Usuario ervin = new Usuario("2", "56345362271", "Ervin Howell", "Shanna@melissa.tv", new Date(dataNascimento),
                             "Victor Plains", -43.9509, -34.4618, perfilSeguradoCheetah, empresaCheetah);

               Usuario elementine = new Usuario("3", "22666755592", "Clementine Bauch", "Shanna@melissa.tv",
                             new Date(dataNascimento), "Douglas Extension", -68.6102, -47.0653, perfilSeguradoHorse, empresaHorse);

               Usuario patricia = new Usuario("4", "75633818725", "Patricia Lebsack", "Julianne.OConner@kory.org",
                             new Date(dataNascimento), "Hoeger Mall", 29.4572, -164.2990, perfilSeguradoHorse, empresaHorse);

               Usuario chelsey = new Usuario("5", "30730365638", "Chelsey Dietrich", "Lucio_Hettinger@annie.ca",
                             new Date(dataNascimento), "Skiles Walks", -31.8129, -62.5342, perfilCorretor, empresaCheetah);

               Usuario bill = new Usuario("6", "16480376668", "Bill Gates", "bill_gates@microsoft.com",
                             new Date(dataNascimento), "Fifth Avenue", 32.567, -65.3478, perfilCorretor, empresaCheetah);

               Usuario steve = new Usuario("7", "34209374741", "Steve Jobs", "steve_jobs@apple.com", new Date(dataNascimento),
                             "Cupertino Street", 28.6789, -50.7653, perfilCallCenterCheetah, empresaCheetah);

               Usuario mark = new Usuario("8", "89775811848", "Mark Zuckerberg", "mark_zuck@facebook.com",
                             new Date(dataNascimento), "Palo Alto Avenue", 30.6219, -67.4569, perfilCallCenterCheetah, empresaCheetah);

               Usuario james = new Usuario("9", "63177531307", "James Gosling", "james_gosling@java.com",
                             new Date(dataNascimento), "Calgary Street", -32.3456, 85.9614, perfilCallCenterHorse, empresaHorse);

               Usuario larry = new Usuario("10", "78272656850", "Larry Page", "larry_page@google.com",
                             new Date(dataNascimento), "Michigan Blvd", 23.4589, -161.3030, perfilCallCenterHorse, empresaHorse);

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

       public Usuario buscarUsuario(String indAcesso, String id, Date dtNascimento) {
             Usuario usuario = banco.get(id);

             if (indAcesso.equals("2") && indAcesso.equals(usuario.getPerfilAcesso()) && usuario.getDtNascimento().compareTo(dtNascimento) == 0) {
                    return usuario;
             } else if (indAcesso.equals("1") && indAcesso.equals(usuario.getPerfilAcesso())
                           || indAcesso.equals("3") && indAcesso.equals(usuario.getPerfilAcesso())
                           || indAcesso.equals("4") && indAcesso.equals(usuario.getPerfilAcesso())
                           || indAcesso.equals("5") && indAcesso.equals(usuario.getPerfilAcesso())) {
                    return usuario;
             } else if (indAcesso.equals("") || indAcesso == null) {
            	 return usuario;
             } else {
            	 return null;
             }
       }
}
