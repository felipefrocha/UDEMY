package com.springAngular.westeros.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/graphs")
public class GraphResource {
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "rest esta funcionando!";
	}

}
