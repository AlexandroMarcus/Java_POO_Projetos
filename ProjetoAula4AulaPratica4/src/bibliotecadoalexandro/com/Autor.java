package bibliotecadoalexandro.com;

public class Autor {
	private String nome;
	private String nacionalidade;
	private String email;
	
	public Autor() {
		
	}
	
	public Autor(String nome, String email, String nacionalidade) {
		super();
		this.nome = nome;
		this.email = email;
		this.nacionalidade = nacionalidade;
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
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public void info() {
		System.out.println("Nome Autor: " + nome);
		System.out.println("Nacionalidade Autor: " + nacionalidade);
		System.out.println("Email Autor: " + email);
	}
	
	
}
