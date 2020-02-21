package com.soa.ws.tp;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface WebServiceComposite {
	
	@WebMethod
	public String verifCategProduct(String id);

}
