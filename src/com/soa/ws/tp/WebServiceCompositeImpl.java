package com.soa.ws.tp;

import javax.jws.WebService;

import org.soa.ws.tp.WebServiceCRUD;
import org.soa.ws.tp.WebServiceCRUDImplService;

@WebService(endpointInterface = "com.soa.ws.tp.WebServiceComposite")
public class WebServiceCompositeImpl implements WebServiceComposite{

	@Override
	public String verifCategProduct(String id) {
		WebServiceCRUDImplService service = new WebServiceCRUDImplService();
		WebServiceCRUD stub = service.getWebServiceCRUDImplPort();
		
		String categ = stub.readCategProduct(id);
		
		if (categ.equals("null"))
		   return "Produit n'exitse pas";
		else 
			return categ;
	}

}
