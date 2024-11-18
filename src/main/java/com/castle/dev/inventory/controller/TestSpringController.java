package com.castle.dev.inventory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestSpringController {
	
	@GetMapping("/hola")
	public String hola() {
		return "hola";
	}

}
