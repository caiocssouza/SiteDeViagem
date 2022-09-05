package modelo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compra {
	
	private int id;
	private Date data_compra;
	private double valor_compra;
	
	private Usuario usuario;
	
	private List<Itens_compra> itens = new ArrayList<Itens_compra>();


	public Compra() {
		
	}	
	
	public Compra(int id, Date data_compra, double valor_compra, Usuario usuario ) {
		super();
		this.id = id;
		this.data_compra = data_compra;
		this.valor_compra = valor_compra;
		this.usuario = usuario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getData_compra() {
		return data_compra;
	}
	public void setData_compra(Date data_compra) {
		this.data_compra = data_compra;
	}
	public double getValor_compra() {
		return valor_compra;
	}
	public void setValor_compra(double valor_compra) {
		this.valor_compra = valor_compra;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	//MOSTRAR
	public String mostrar() {
		return "COMPRA: [id=" + id + ", data_compra=" + data_compra + ", valor_compra=" + valor_compra + "]";
	}

}
