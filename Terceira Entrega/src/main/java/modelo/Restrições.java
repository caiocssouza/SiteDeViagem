package modelo;

public class Restrições{
	
	private int id;
	private String tipo;
	
	
	
	public Restrições(int id, String tipo) {
		super();
		this.id = id;
		this.tipo = tipo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//MÉTODO
	
	public String mostrar() {
		return "ID: " + this.id + "TIPO: " + this.tipo;
	}
	
}
