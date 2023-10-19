package com.servicio.epy.apicambio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.servicio.epy.apicambio.dto.CambioDTO;
import com.servicio.epy.apicambio.dto.CambioReq;
import com.servicio.epy.apicambio.dto.CambioRes;
import com.servicio.epy.apicambio.dto.ResponseGeneral;
import com.servicio.epy.apicambio.entity.*;
import com.servicio.epy.apicambio.service.ICambioService;

@RestController
@RequestMapping("/api/cambio")
public class CambioController {
	
	@Autowired
	private ICambioService serviceCambio;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Cambio>>  listar() {
		List<Cambio> lista = serviceCambio.list();
		return new ResponseEntity<>(lista, HttpStatus.OK);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@GetMapping("/getCambioMoneda")
	public ResponseEntity<ResponseGeneral> getCambioMoneda(@RequestBody CambioReq cambioReq) {
		ResponseGeneral objResponseGeneral = null;
		try {
			Double tipoCambio= serviceCambio.getTipoCambioxMonedas(cambioReq.getMonedaOrigen(), cambioReq.getMonedaDestino());
			if (tipoCambio !=null) {
				CambioRes objCambioRes = new CambioRes();
				objCambioRes.setMonedaOrigen(cambioReq.getMonedaOrigen());
				objCambioRes.setMonedaDestino(cambioReq.getMonedaDestino());
				objCambioRes.setMonto(cambioReq.getMonto());
				objCambioRes.setTipoCambio(tipoCambio);
				objCambioRes.setMontoCambio(tipoCambio * cambioReq.getMonto());
				
				objResponseGeneral = new ResponseGeneral(1, "Exito", objCambioRes);
			}else {
				objResponseGeneral = new ResponseGeneral(2, "Las monedas no se encuentran registradas en la BD.", null);
			}
		}catch(Exception ex) {
			objResponseGeneral = new ResponseGeneral(0, "Ocurrio un error", null);
		}
		return new ResponseEntity<>(objResponseGeneral, HttpStatus.OK);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PostMapping("/updateTipoCambio")
	public ResponseEntity<ResponseGeneral> updateTipoCambio(@RequestBody CambioReq cambioReq) {
		ResponseGeneral objResponse = null;
		
		try {
			Integer idRegistro= serviceCambio.getId(cambioReq.getMonedaOrigen(), cambioReq.getMonedaDestino());
			if (idRegistro !=null) {
				Cambio cambioAux = new Cambio();
				cambioAux.setId(idRegistro);
				cambioAux.setMonedaDestino(cambioReq.getMonedaDestino());
				cambioAux.setMonedaOrigen(cambioReq.getMonedaOrigen());
				cambioAux.setTipoCambio(cambioReq.getMonto());
				Cambio cambioMoneda = serviceCambio.save(cambioAux);
				CambioDTO objCambio = new CambioDTO(cambioMoneda);
				
				objResponse = new ResponseGeneral(1, "Exito", objCambio);
			}else {
				objResponse = new ResponseGeneral(2, "Las monedas no se encuentran registradas en la BD.", null);
			}
		}catch(Exception ex) {
			objResponse = new ResponseGeneral(0, "Ocurrio un error", null);
		}
		
		return new ResponseEntity<>(objResponse, HttpStatus.OK);
	}
	
	
	
	
	

}
