package com.tests.jaxws.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.tests.jaxws.ws.model.Disc;

@WebService(endpointInterface = "com.tests.jaxws.ws.DiscsService")
public class DiscsServiceImpl implements DiscsService {

	List<Disc> discsList = null;
		
	@Override
	public List<Disc> getDiscsList() {
		if (discsList == null)
			fillList();
		return discsList;
	}

	@Override
	public Disc getDiscsById(int id) {
		if (discsList == null)
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
		disc2.setId(2);
		disc2.setTitle("Fear of the Dark");
		disc2.setGroup("Iron Maiden");
		disc2.setYear("1987");
		discsList.add(disc2);
		
		Disc disc3 = new Disc();
		disc3.setId(3);
		disc3.setTitle("Master of Puppets");
		disc3.setGroup("Metallica");
		disc3.setYear("1999");
		discsList.add(disc3);
		
		Disc disc4 = new Disc();
		disc4.setId(4);
		disc4.setTitle("Live and Loud");
		disc4.setGroup("Ozzy Osbourne");
		disc4.setYear("1991");
		discsList.add(disc4);
		
		Disc disc5 = new Disc();
		disc5.setId(5);
		disc5.setTitle("Black Sabbath");
		disc5.setGroup("Black Sabbath");
		disc5.setYear("1087");
		discsList.add(disc5);
		
		Disc disc6 = new Disc();
		disc6.setId(6);
		disc6.setTitle("Iowa");
		disc6.setGroup("Slipknot");
		disc6.setYear("2003");
		discsList.add(disc6);
		
	}

}
