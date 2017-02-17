package br.com.gch.back.rest.ws.client;

import br.com.ghc.back.rest.ws.WebMethodService;
import br.com.ghc.back.rest.ws.WebMethodServiceService;


public class Barramento {
	
	public WebMethodService getPort(){
		
		WebMethodServiceService webMethod = new WebMethodServiceService();
		
		WebMethodService port = webMethod.getWebMethodServicePort();
		
		return port;
		
	}

}
