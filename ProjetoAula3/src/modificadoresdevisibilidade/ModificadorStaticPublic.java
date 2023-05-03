package modificadoresdevisibilidade;

public class ModificadorStaticPublic {
	public static void main(String[] args) {
		String nomeDela = ClassStaticPublic.nome;
		System.out.println(nomeDela);
		
		int tamanhoDoNome = ClassStaticPublic.tamanhoNome("Emily");
		System.out.println(tamanhoDoNome);
	}
}