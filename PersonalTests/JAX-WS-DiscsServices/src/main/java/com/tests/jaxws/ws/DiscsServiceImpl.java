package com.tests.jaxws.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.tests.jaxws.ws.model.Disc;

@WebService(endpointInterface = "com.tests.jaxws.ws.DiscsService")
public class DiscsServiceImpl implements DiscsService {

	List<Disc> discsList;
		
	@Override
	public List<Disc> getDiscsList() {
		fillList();
		return discsList;
	}

	@Override
	public Disc getDiscsById(int id) {
		fillList();

		for (Disc disc : discsList) {
			if (disc.getId() == id) {
				return disc;
			}
		}
		
		return null;
	}
	
	private void fillList() {
		
		discsList = new ArrayList<>();
		
		Disc disc1 = new Disc();
		disc1.setId(1);
		disc1.setTitle("Lateralus");
		disc1.setGroup("Tool");
		disc1.setYear("1998");
		discsList.add(disc1);
		
		Disc disc2 = new Disc();
		disc1.setId(2);
		disc1.setTitle("Fear of the Dark");
		disc1.setGroup("Iron Maiden");
		disc1.setYear("1987");
		discsList.add(disc2);
		
		Disc disc3 = new Disc();
		disc1.setId(3);
		disc1.setTitle("Master of Puppets");
		disc1.setGroup("Metallica");
		disc1.setYear("1999");
		discsList.add(disc3);
		
		Disc disc4 = new Disc();
		disc1.setId(4);
		disc1.setTitle("Live and Loud");
		disc1.setGroup("Ozzy Osbourne");
		disc1.setYear("1991");
		discsList.add(disc4);
		
		Disc disc5 = new Disc();
		disc1.setId(5);
		disc1.setTitle("Black Sabbath");
		disc1.setGroup("Black Sabbath");
		disc1.setYear("1087");
		discsList.add(disc5);
		
		Disc disc6 = new Disc();
		disc1.setId(6);
		disc1.setTitle("Iowa");
		disc1.setGroup("Slipknot");
		disc1.setYear("2003");
		discsList.add(disc6);
		
	}

}
