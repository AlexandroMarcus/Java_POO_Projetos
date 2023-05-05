package aluno;

public class Curso {
	String nome;
	double mensalidade;
	
	void info() {
		System.out.println("Nome Curso: " + nome);
		System.out.println("Mensalidade do Curso: " + mensalidade);
	}

	public Curso(String nome, double mensalidade) {
		super();
		this.nome = nome;
		this.mensalidade = mensalidade;
	}
}
