package bibliotecadoalexandro.com;

public class Principal {

	public static void main(String[] args) {
		
		LivroDigital ld = new LivroDigital("Senhor dos Aneis",
				new Autor("Tolkein","tolkein@email.com","Britanico"),
				"Aventura",
				5,
				10000,
				3500);
		
		ld.info();

	}

}
