package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/convertWord")
public class ConvertWordController {

	@RequestMapping(value = "/convert", method = RequestMethod.GET)
	 public BaseResponse convert(@RequestParam(value = "word") String word) {
		// Para ejecutarlo en el navegador escribir:
		// http://localhost:8080/SpringRestService/rest/convertWord/convert?word=holamundo
		
		BaseResponse base = new BaseResponse();
		base.setRet(word.toUpperCase());
		base.setStatus("OK");
		
		return base;
	 }
	
}
