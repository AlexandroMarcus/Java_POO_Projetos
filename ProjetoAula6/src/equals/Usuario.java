package equals;

public class Usuario {
	int id;
	String nome;
	String cpf;
	
	public Usuario(int id, String nome, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public boolean equals(Object outro) {
		//Compara consigo mesmo
		if(outro == this) {
			return true;
		}
		//O objeto é uma instância de outro usuário ?
		if(!(outro instanceof Usuario)) {
			return false;
		}
		
		//type cast para Usuario
		Usuario o = (Usuario) outro;
		
		//Compara se os atributos são iguais
		if(this.id == o.id && this.nome.equals(o.nome) && this.cpf.equals(o.cpf)) {
			return true;
		}
		return false;
	}
}

