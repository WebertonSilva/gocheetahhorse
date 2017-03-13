package br.com.gch.back.rest.producer;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.gch.back.rest.dao.LoginDao;

@ApplicationScoped
public class LoginDaoProducer {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Produces
	public LoginDao createLoginDao() {
		logger.info("--> Creating loginDao");
		return new LoginDao();
	}
}