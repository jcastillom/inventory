package com.castle.dev.inventory.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.castle.dev.inventory.model.Herramienta;
import com.castle.dev.inventory.service.HerramientaService;

@Service
public class HerramientaServiceImpl implements HerramientaService {

	@Override
	public List<Herramienta> obtenerHerramientas() {
		return obtenerHerramientasLocal();
	}
	
	List<Herramienta> obtenerHerramientasLocal(){
		List<Herramienta> listaHerramientas = new ArrayList<>();
		Herramienta herramienta1 = new Herramienta();
		Herramienta herramienta2 = new Herramienta();
		
		herramienta1.setIdHerramienta(1);
		herramienta1.setFolio("1-001-000001");
		herramienta1.setDescripcion("Martillo");
		herramienta1.setDetalle("Martillo con mango de madera");
		herramienta1.setMarca("Milwaukee");
		herramienta1.setCveTipoHerramienta(1);
		
		herramienta2.setIdHerramienta(2);
		herramienta2.setFolio("1-001-000002");
		herramienta2.setDescripcion("Brocas");
		herramienta2.setDetalle("Broca de 1/2, Broca de 3/4");
		herramienta2.setMarca("Milwaukee");
		herramienta2.setCveTipoHerramienta(1);
		
		listaHerramientas.add(herramienta1);
		listaHerramientas.add(herramienta2);
		
		return listaHerramientas;
	}

}
