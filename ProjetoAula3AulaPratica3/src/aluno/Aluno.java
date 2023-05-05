package aluno;

public class Aluno {
	String nome;
	int matricula;
	double desconto;
	Curso curso;
	
	public Aluno(String nome, int matricula, double desconto, Curso curso) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.desconto = desconto;
		this.curso = curso;
	}
	
	void info() {
		System.out.println("Nome Aluno: " + nome);
		System.out.println("Matricula Aluno: " + matricula);
		System.out.println("Desconto Aluno: " + desconto);
		
		curso.info();
	}
	
	double pagamento() {
		
		//informa o preco que o aluno paga, considerando seu desconto e preço de seu curso.
		//1  -  0.1 => 0.9
		//1  -  0.2  => 0.8
		
		
		return curso.mensalidade*(1-desconto);
	}
}
