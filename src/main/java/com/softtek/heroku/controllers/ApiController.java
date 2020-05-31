package com.softtek.heroku.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController {

	@GetMapping("/test")
	public Map detalle() {
		
		Map<String,String> test = new HashMap<String,String>();
		
		test.put("Empresa", "Hola Softtek");
		
		return test;
	}
}
