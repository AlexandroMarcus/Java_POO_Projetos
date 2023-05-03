package imprimivel;

public class Funcionario implements Imprimir{
	String nome;
	String cpf;
	
	public Funcionario(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	@Override
	public void imprimir() {
		System.out.println("Nome: " + nome);
		System.out.println("Cpf: " + cpf);
		System.out.println("---------------");
	}
}