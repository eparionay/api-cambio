package com.servicio.epy.apicambio.dto;

import java.io.Serializable;

public class ResponseGeneral<T> implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codigo;
	private String mensaje;
	private T entidad;
	
	public ResponseGeneral() {
	}
	
	

	public ResponseGeneral(int codigo, String mensaje, T entidad) {
		super();
		this.codigo = codigo;
		this.mensaje = mensaje;
		this.entidad = entidad;
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public T getEntidad() {
		return entidad;
	}

	public void setEntidad(T entidad) {
		this.entidad = entidad;
	}
	
	
	

}
