package com.servicio.epy.apicambio.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.servicio.epy.apicambio.entity.Cambio;

@Repository
public interface CambioRepository extends CrudRepository<Cambio, Long>  {
	
	@Query("select e.tipoCambio from EntityCambio e where monedaOrigen=?1 and monedaDestino=?2")
	Double getTipoCambioxMonedas(String monedaOrigen, String monedaDestino);
	
	@Query("select e.id from EntityCambio e where monedaOrigen=?1 and monedaDestino=?2")
	Integer getId(String monedaOrigen, String monedaDestino);
	
}
