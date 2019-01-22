package com.test.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addOperation")
public class AddController {

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	 public BaseResponse add(@RequestBody AddBean request) {
		// Para ejecutarlo en el navegador escribir:
		// http://localhost:8080/SpringRestService/rest/addOperation/add
		int result = Integer.parseInt(request.getNumber1()) + Integer.parseInt(request.getNumber2());
		
		BaseResponse base = new BaseResponse();
		base.setRet(String.valueOf(result));
		base.setStatus("OK");

		return base;
	 }
	
}
