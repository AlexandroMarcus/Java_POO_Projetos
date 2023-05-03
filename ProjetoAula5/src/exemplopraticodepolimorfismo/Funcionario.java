package exemplopraticodepolimorfismo;

public class Funcionario {
	String nome;
	
	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	public float pagamento() {
		System.out.println("Calculo do pagamento");
		return 0;
	}
}
