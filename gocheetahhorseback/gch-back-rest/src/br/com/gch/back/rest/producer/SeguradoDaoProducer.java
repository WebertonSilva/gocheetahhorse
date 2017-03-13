package br.com.gch.back.rest.producer;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.gch.back.rest.dao.SeguradoDao;

@ApplicationScoped
public class SeguradoDaoProducer {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Produces
	public SeguradoDao createSeguradoDao() {
		logger.info("--> Creating seguradoDao");
		return new SeguradoDao();
	}
}
