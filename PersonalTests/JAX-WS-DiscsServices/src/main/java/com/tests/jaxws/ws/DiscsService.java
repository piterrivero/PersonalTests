package com.tests.jaxws.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.tests.jaxws.ws.model.Disc;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL)
public interface DiscsService {

	@WebMethod List<Disc> getDiscsList();

	@WebMethod Disc getDiscsById(int id);
	
}

