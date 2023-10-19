package com.servicio.epy.apicambio.dto;

public class CambioReq {

	
	private Double monto;
	private String monedaOrigen;
	private String monedaDestino;
	
	public CambioReq() {
		
	}
	
	public CambioReq(Double monto, String monedaOrigen, String monedaDestino) {
		super();
		this.monto = monto;
		this.monedaOrigen = monedaOrigen;
		this.monedaDestino = monedaDestino;
	}

	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
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
	
	
	
	
	
}
