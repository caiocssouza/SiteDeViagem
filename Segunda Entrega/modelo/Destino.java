package modelo;

public class Destino {
	
	private int id;
	private String cidade_destino;
	private String estado_destino;
	private String pais_destino;
	
	public Destino () {
		
	}
	
	public Destino(int id, String cidade_destino, String estado_destino, String pais_destino) {
		
		this.id = id;
		this.cidade_destino = cidade_destino;
		this.estado_destino = estado_destino;
		this.pais_destino = pais_destino;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
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
	
	//MOSTRAR

	public String mostrar() {
		return "DESTINO: [id=" + id + ", cidade_destino=" + cidade_destino + ", estado_destino=" + estado_destino
				+ ", pais_destino=" + pais_destino + "]";
	}
	
	

}
