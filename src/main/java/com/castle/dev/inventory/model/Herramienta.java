package com.castle.dev.inventory.model;

import java.io.Serializable;

public class Herramienta implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int idHerramienta;
	private String folio;
	private String descripcion;
	private String detalle;
	private String marca;
	private int cveTipoHerramienta;
	
	public int getIdHerramienta() {
		return idHerramienta;
	}
	public void setIdHerramienta(int idHerramienta) {
		this.idHerramienta = idHerramienta;
	}
	public String getFolio() {
		return folio;
	}
	public void setFolio(String folio) {
		this.folio = folio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCveTipoHerramienta() {
		return cveTipoHerramienta;
	}
	public void setCveTipoHerramienta(int cveTipoHerramienta) {
		this.cveTipoHerramienta = cveTipoHerramienta;
	}
	
}
