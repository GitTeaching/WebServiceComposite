package com.soa.ws.tp;

import javax.xml.ws.Endpoint;

public class WebServiceCompositePublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:5678/composite", new WebServiceCompositeImpl());
	}
}
