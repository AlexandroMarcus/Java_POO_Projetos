package modificadoresdevisibilidade;

/*
 * public: o elemento é publico e pode ser acessado por qualquer outra classe.
 * 
 * static: o elemento é privado e só pode ser acessado internamente na classe.
 * 
 * protected: o elemento é protegido e só pode ser acessado somente de dentro da propria classe, outras classes no mesmo
 * pacote e também por classes filhas.
 * 
 * default (sem nenhum modificador): o elemento nesse caso, e acessível por outras classes dentro do mesmo pacto.
 * 
 * */



public class Aluno {
	private int matricula;  
	protected int notas[];
	public String cpf;
	public String nome;
	
	public Aluno(int matricula, String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
//		this.matricula = Cadastro.gerarNotaMatricula();
	}
	public void cadastrarNotas() {
		//coidgo cadastro
	}
//	public int mediaNotas() {
		//codigo notas
	} 
//}
