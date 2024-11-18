package com.castle.dev.inventory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/inicio")
public class TestSpringController {
	
	@GetMapping(value = "/ejemploSB")
	public String obtenerEjemplo() {
		return "Hola mundo Spring boot";
	}

}
