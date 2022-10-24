package com.site.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
public class Compra extends Entidade {
	
	@Column (nullable = false, length= 80, unique = true )
	public String nome;
	
	@Column(nullable = false, length= 10, unique = true)
	public BigDecimal valor_compra;
	
	@Column(nullable = false, name="data")
	@DateTimeFormat(iso = ISO.DATE)
	public Date data;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValor_compra() {
		return valor_compra;
	}

	public void setValor_compra(BigDecimal valor_compra) {
		this.valor_compra = valor_compra;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
	
}