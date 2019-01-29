package com.tests.jaxws.endpoint;

import javax.xml.ws.Endpoint;

import com.tests.jaxws.ws.DiscsServiceImpl;

public class DiscsPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/discs", new DiscsServiceImpl());
	}
	
}
