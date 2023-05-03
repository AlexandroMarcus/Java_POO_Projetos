package metodotostring;

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
	
	/*Se eu comentar esse metodo e tentar imprimir o objeto irá aparecer no console o endereço da memória*/
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", cpf=" + cpf + "]";
	}
}
