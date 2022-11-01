package com.viagem.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "destino")
public class Destino implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	public String estado;
	
	public String pais;
	
	
	@OneToMany(mappedBy = "destino")
	private List<Passagem> passagens = new ArrayList<Passagem>();

	public Destino() {}

	public Destino(Long id, String estado, String pais, List<Passagem> passagens) {
		super();
		this.id = id;
		this.estado = estado;
		this.pais = pais;
		this.passagens = passagens;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPaís(String pais) {
		this.pais = pais;
	}

	public List<Passagem> getPassagens() {
		return passagens;
	}

	public void setPassagens(List<Passagem> passagens) {
		this.passagens = passagens;
	}

	@Override
	public int hashCode() {
		return Objects.hash(estado, id, passagens, pais);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Destino other = (Destino) obj;
		return Objects.equals(estado, other.estado) && Objects.equals(id, other.id)
				&& Objects.equals(passagens, other.passagens) && Objects.equals(pais, other.pais);
	}

	
	
}
