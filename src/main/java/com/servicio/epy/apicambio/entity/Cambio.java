package com.servicio.epy.apicambio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Cambio")
@Entity(name = "EntityCambio")
public class Cambio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "moneda_origen")
	private String monedaOrigen;
	@Column(name = "moneda_destino")
	private String monedaDestino;
	@Column(name = "tipo_cambio")
	private Double tipoCambio;
	
	public Cambio() {	
	}
	
	public Cambio(Integer id, String monedaOrigen, String monedaDestino, Double tipoCambio) {
		super();
		this.id = id;
		this.monedaOrigen = monedaOrigen;
		this.monedaDestino = monedaDestino;
		this.tipoCambio = tipoCambio;
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
