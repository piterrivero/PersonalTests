package com.tests.ws.client;

import java.util.List;

import com.tests.jaxws.ws.Disc;

public class CallerService {

	public static void main(String[] args) {

		ExternalClient client = new ExternalClient();
		
		List<Disc> list = client.getDiscsList();
		
		System.out.println(" List of all discs ");
		
		for (Disc disc : list) {
			System.out.println(disc.getId() + " - " + disc.getTitle() + " - "+ disc.getGroup() + " - " + disc.getYear());
		}
		
		System.out.println(" Disc id = 4");
		
		Disc discById = client.getDiscById(4);
		
		System.out.println(discById.getId() + " - " + discById.getTitle() + " - "+ discById.getGroup() + " - " + discById.getYear());
		
	}

}
