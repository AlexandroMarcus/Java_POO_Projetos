package aluno;

public class Principal {

	public static void main(String[] args) {
		Aluno mario = new Aluno();
		mario.cpf = "111.111.111-1";
		mario.nome = "Super Mario";
		mario.matricula = 1001;
		
		Aluno luigi = new Aluno();
		luigi.cpf = "222.222.222.-2";
		luigi.nome = "Super Luigi";
		luigi.matricula = 1002;
		
		Aluno antigo;
		if(mario.matricula<luigi.matricula) {
			antigo = mario;
		}
		else {
			antigo = luigi;
		}
		
		mario.info();
		luigi.info();
		System.out.println("Aluno mais antigo " + antigo.nome);
	}

}
