package com.viagem.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Passagem implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private LocalDate dataIda;
	
	private LocalDate dataVolta;
	
	private double preco;
	
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "destino_id")
	private Destino destino;
	
	public Passagem() {}

	public Passagem(Long id, LocalDate dataIda, LocalDate dataVolta, double preco, Cliente cliente, Destino destino) {
		super();
		this.id = id;
		this.dataIda = dataIda;
		this.dataVolta = dataVolta;
		this.preco = preco;
		this.cliente = cliente;
		this.destino = destino;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDataIda() {
		return dataIda;
	}

	public void setDataIda(LocalDate dataIda) {
		this.dataIda = dataIda;
	}

	public LocalDate getDataVolta() {
		return dataVolta;
	}

	public void setDataVolta(LocalDate dataVolta) {
		this.dataVolta = dataVolta;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cliente, dataIda, dataVolta, destino, id, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passagem other = (Passagem) obj;
		return Objects.equals(cliente, other.cliente) && Objects.equals(dataIda, other.dataIda)
				&& Objects.equals(dataVolta, other.dataVolta) && Objects.equals(destino, other.destino)
				&& Objects.equals(id, other.id)
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco);
	}
	
	
	
}
