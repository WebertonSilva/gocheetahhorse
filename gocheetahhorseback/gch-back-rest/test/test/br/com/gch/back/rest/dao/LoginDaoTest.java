package test.br.com.gch.back.rest.dao;

import java.text.ParseException;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.gch.back.rest.dao.LoginDao;
import br.com.gch.back.rest.model.Usuario;
import br.com.gch.back.rest.utils.DateUtils;

public class LoginDaoTest {
	
	
	private LoginDao dao;
	
	@Before
	public void init(){
		 this.dao = new LoginDao();
	}
	
	@Test
	public void buscarUsuarioTest() throws ParseException{
		
		Usuario usuario = this.dao.buscarUsuario("1", "38961873091", new Date(315543600000L));
		Assert.assertTrue(usuario.getDtNascimento()
				.compare(DateUtils.toXmlGregorianCalendar(dao.getDate(1980, 1, 1)))==0);
		
	}

}
