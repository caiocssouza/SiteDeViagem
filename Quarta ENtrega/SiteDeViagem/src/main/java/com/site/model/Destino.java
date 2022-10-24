package com.site.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Destino extends Entidade {
	
	@Column(name="cidade_destino", nullable=false)
	private String cidade_destino;
	
	@Column(name="estado_destino", nullable = false)
	private String estado_destino;
	
	@Column(name="pais_destino", nullable=false)
	private String pais_destino;
	
	public String getCidade_destino() {
		return cidade_destino;
	}

	public void setCidade_destino(String cidade_destino) {
		this.cidade_destino = cidade_destino;
	}

	public String getEstado_destino() {
		return estado_destino;
	}

	public void setEstado_destino(String estado_destino) {
		this.estado_destino = estado_destino;
	}

	public String getPais_destino() {
		return pais_destino;
	}

	public void setPais_destino(String pais_destino) {
		this.pais_destino = pais_destino;
	}
	
	

}
