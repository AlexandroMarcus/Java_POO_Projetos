package modificadoresdevisibilidade;

public class ModificadorPublic {
	public static void main(String[] args) {
		ClassPublic meuCarro = new ClassPublic("Gol");
		meuCarro.toString();

		System.out.println(meuCarro.toString());

		ClassPublic meuCarro1 = new ClassPublic();
		meuCarro1.carro = "Jetta";
		
		System.out.println("meu futuro carro: " + meuCarro1.carro);
	}
}
