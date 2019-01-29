package com.tests.ws.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.tests.jaxws.ws.Disc;
import com.tests.jaxws.ws.DiscsService;

public class ExternalClient {
	
	public List<Disc> getDiscsList() {
		
		URL url = null;
		try {
			url = new URL("http://localhost:9999/ws/discs?wsdl");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	    QName qname = new QName("http://ws.jaxws.tests.com/", "DiscsServiceImplService");
        Service service = Service.create(url, qname);
        
        DiscsService serv = service.getPort(DiscsService.class);
        
        List<Disc> list = serv.getDiscsList();
        
        return list;
	}
	
	public Disc getDiscById(int id) {
		
		URL url = null;
		try {
			url = new URL("http://localhost:9999/ws/discs?wsdl");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	    QName qname = new QName("http://ws.jaxws.tests.com/", "DiscsServiceImplService");
        Service service = Service.create(url, qname);
        
        DiscsService serv = service.getPort(DiscsService.class);
        
        List<Disc> list = serv.getDiscsList();
        
        for (Disc disc : list) {
			if (disc.getId() == id) {
				return disc;
			}
		}
        
        return null;
	}
	
	public int addDisc(Disc disc) {
		
		URL url = null;
		try {
			url = new URL("http://localhost:9999/ws/discs?wsdl");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	    QName qname = new QName("http://ws.jaxws.tests.com/", "DiscsServiceImplService");
        Service service = Service.create(url, qname);
        
        DiscsService serv = service.getPort(DiscsService.class);
        
        serv.addDisc(disc);
        
        return disc.getId();
	}


}
