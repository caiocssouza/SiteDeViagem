package modelo;

public class Usuario {
	
	private int id;
	private String nome;
	private String email;
	private String senha;
	
	private Restrições restrições;
	
	public Usuario() {
		
	}
	
	public Usuario(int id, String nome, String email, String senha, Restrições restrições) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.restrições = restrições;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Restrições getRestrições() {
		return restrições;
	}

	public void setRestrições(Restrições restrições) {
		this.restrições = restrições;
	}

	//MOSTRAR
	public String mostrar() {
		return "USUÁRIO [id=" + this.id + ", nome=" + this.nome + ", email=" + this.email + ", senha=" + this.senha +  "tipo de usuário: " + this.restrições + "]";
	}

	

	

}
