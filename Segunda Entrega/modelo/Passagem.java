package modelo;
import java.util.Date;

public class Passagem {
	private int id;
	private Date data_passagem;
	private String preço_passagem;
	private Date data;
	
	public Passagem() {
		
	}
	
	public Passagem(int id, Date data_passagem, String preço_passagem, Date data) {
		
		this.id = id;
		this.data_passagem = data_passagem;
		this.preço_passagem = preço_passagem;
		this.data = data;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData_passagem() {
		return data_passagem;
	}

	public void setData_passagem(Date data_passagem) {
		this.data_passagem = data_passagem;
	}

	public String getPreço_passagem() {
		return preço_passagem;
	}

	public void setPreço_passagem(String preço_passagem) {
		this.preço_passagem = preço_passagem;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	//MOSTRAR
	public String mostrar() {
		return "PASSAGEM: [id=" + id + ", data_passagem=" + data_passagem + ", preço_passagem=" + preço_passagem + "]";
	}

	
	
}
