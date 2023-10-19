package com.servicio.epy.apicambio.service;

import java.util.List;

import com.servicio.epy.apicambio.entity.Cambio;

public interface ICambioService {
	
	Cambio save(Cambio cambio);
	
	List<Cambio> list();
	
	Double getTipoCambioxMonedas(String monedaOrigen, String monedaDestino);
	
	Cambio update(Cambio cambio);
	
	Integer getId(String monedaOrigen, String monedaDestino);
	
	

}
