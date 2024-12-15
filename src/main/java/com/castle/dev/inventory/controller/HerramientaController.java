package com.castle.dev.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.castle.dev.inventory.base.Base;
import com.castle.dev.inventory.service.HerramientaService;

@Controller
@RequestMapping("/herramientas")
public class HerramientaController extends Base {
	
	 @Autowired
	 private HerramientaService herramientaService;
	
	@GetMapping("/busqueda")
	public String consultarHerramientas(Model model) {
		logger.debug("¡Llegando a controller de herramientas!");
		model.addAttribute("listaHerramientas", herramientaService.obtenerHerramientas());
		return "inventory/herramientas";
	}

}
