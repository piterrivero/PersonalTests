package com.tests.ws.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.tests.jaxws.ws.HelloWorld;


public class ExternalClient {
	
	public String getHelloWorldCustomMsg(String name) throws MalformedURLException {
		String ret = null;
		
		URL url = new URL("http://localhost:9999/ws/hello?wsdl");
	    QName qname = new QName("http://ws.jaxws.tests.com/", "HelloWorldImplService");
        Service service = Service.create(url, qname);
        
        HelloWorld hello = service.getPort(HelloWorld.class);
        ret = hello.getHelloWorldAsString(name);
        
        return ret;
	}


}
