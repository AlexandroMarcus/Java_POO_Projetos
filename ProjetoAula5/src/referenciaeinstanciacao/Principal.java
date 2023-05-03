package referenciaeinstanciacao;

public class Principal {

	public static void main(String[] args) {
		Aluno mario = new Aluno();
		Aluno luigi = mario;
		Aluno yoshi = mario;
		
		mario.nome = "Super Mario";
		System.out.println(mario.nome); //Imprimirá "Super Mario"
		System.out.println(luigi.nome); //Imprimirá "Super Mario"
		System.out.println(yoshi.nome); //Imprimirá "Super Mario"
		
		System.out.println();
		
		luigi.nome = "Super Luigi";
		System.out.println(mario.nome); //Imprimirá "Super Luigi"
		System.out.println(luigi.nome); //Imprimirá "Super Luigi"
		System.out.println(yoshi.nome); //Imprimirá "Super Luigi"
		
		

	}

}
