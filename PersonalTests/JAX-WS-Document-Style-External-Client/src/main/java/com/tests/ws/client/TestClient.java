package com.tests.ws.client;

import java.net.MalformedURLException;

public class TestClient {

	public static void main(String[] args) {

		ExternalClient ext = new ExternalClient();
		
		try {
			System.out.println(ext.getHelloWorldCustomMsg("Piter"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
