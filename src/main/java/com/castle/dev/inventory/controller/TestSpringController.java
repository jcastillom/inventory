package com.castle.dev.inventory.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@Controller
public class TestSpringController {
	
	@GetMapping("/hola")
	public String hola() {
		return "hola";
	}
	
	@GetMapping("/obtenerDatos")
	@ResponseStatus(code = HttpStatus.OK)
	public String hola2(Model model) {
		return "cadena de controller";
	}
	
	@GetMapping("/ejemplo")
	public String ejemplo() {
		return "ejemplo";
	}
	@GetMapping("/	")
	public String elfindelmundoseacerca() {
		return "elfindelmundoseacerca";
	}

}


