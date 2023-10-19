package com.servicio.epy.apicambio.dto;

import java.io.Serializable;

import com.servicio.epy.apicambio.entity.Cambio;

public class CambioDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String monedaOrigen;
	private String monedaDestino;
	private Double tipoCambio;
	
	public CambioDTO() {
		
	}
	
	public CambioDTO(Integer id, String monedaOrigen, String monedaDestino, Double tipoCambio) {
		super();
		this.id = id;
		this.monedaOrigen = monedaOrigen;
		this.monedaDestino = monedaDestino;
		this.tipoCambio = tipoCambio;
	}
	
	public CambioDTO(Cambio cambio) {
		this.id= cambio.getId();
		this.monedaOrigen = cambio.getMonedaOrigen();
		this.monedaDestino = cambio.getMonedaDestino();
		this.tipoCambio = cambio.getTipoCambio();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMonedaOrigen() {
		return monedaOrigen;
	}

	public void setMonedaOrigen(String monedaOrigen) {
		this.monedaOrigen = monedaOrigen;
	}

	public String getMonedaDestino() {
		return monedaDestino;
	}

	public void setMonedaDestino(String monedaDestino) {
		this.monedaDestino = monedaDestino;
	}

	public Double getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(Double tipoCambio) {
		this.tipoCambio = tipoCambio;
	}
	
	
	
	
	
	
	
}
