package com.castle.dev.inventory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.castle.dev.inventory.base.BaseController;

@Controller
@RequestMapping("/")
public class InicioController extends BaseController{
	
	@GetMapping("/inicio")
	public String inicio() {
		logger.debug("pasano por inicio...");
		return "inicio";
	}

}


