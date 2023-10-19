package com.servicio.epy.apicambio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicio.epy.apicambio.entity.Cambio;
import com.servicio.epy.apicambio.repository.CambioRepository;

@Service
public class CambioServiceImpl  implements ICambioService {
	
	@Autowired
	private CambioRepository repositoryCambio;
	
	@Override
	public Cambio save(Cambio cambio) {
		return repositoryCambio.save(cambio);
	}

	@Override
	public List<Cambio> list() {
		return (List<Cambio>) repositoryCambio.findAll();
	}

	@Override
	public Double getTipoCambioxMonedas(String monedaOrigen, String monedaDestino) {
		return repositoryCambio.getTipoCambioxMonedas(monedaOrigen, monedaDestino);
	}
	
	@Override
	public Cambio update(Cambio cambio) {
		return repositoryCambio.save(cambio);
	}

	@Override
	public Integer getId(String monedaOrigen, String monedaDestino) {
		return repositoryCambio.getId(monedaOrigen, monedaDestino);
	}
	
	

	
	
	
	
}
