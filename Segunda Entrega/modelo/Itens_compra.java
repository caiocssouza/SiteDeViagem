package modelo;

public class Itens_compra {
	
	private int qtd_itens;
	private double valor_itens;
	private Compra compra;
	private Passagem passagem;
	
	public Itens_compra(int qtd_itens, double valor_itens, Compra compra, Passagem passagem) {
		
		this.qtd_itens = qtd_itens;
		this.valor_itens = valor_itens;
		this.compra = compra;
		this.passagem = passagem;
	}
	public Compra getCompra() {
		return compra;
	}
	public void setCompra(Compra compra) {
		this.compra = compra;
	}
	public Passagem getPassagem() {
		return passagem;
	}
	public void setPassagem(Passagem passagem) {
		this.passagem = passagem;
	}
	public int getQtd_itens() {
		return qtd_itens;
	}
	public void setQtd_itens(int qtd_itens) {
		this.qtd_itens = qtd_itens;
	}
	public double getValor_itens() {
		return valor_itens;
	}
	public void setValor_itens(double valor_itens) {
		this.valor_itens = valor_itens;
	}
	
	private void Total(double preço_passagem) {
		this.valor_itens = this.qtd_itens * preço_passagem;
	}

}
