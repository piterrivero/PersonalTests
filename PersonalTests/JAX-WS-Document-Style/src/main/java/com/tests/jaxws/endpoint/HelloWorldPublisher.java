package com.tests.jaxws.endpoint;

import javax.xml.ws.Endpoint;

import com.tests.jaxws.ws.HelloWorldImpl;

public class HelloWorldPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
	}
	
}
