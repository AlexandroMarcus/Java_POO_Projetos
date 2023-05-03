package conta;

public class Conta {
	String correntista;
	float saldo;
	float limiteSaque;
	
	void sacar(float valor) {
		if(valor > saldo || valor > limiteSaque) {
			System.out.println("Saque não permite");
		}
		else {
			saldo = saldo - valor;
			System.out.println(valor);
		}
		
	}
	
	void depositar(float valor) {
		saldo = saldo + valor;
		System.out.println(valor);
	}
	
	
	void transferir(Conta contaX, float valor) {
	    if (valor > saldo || valor > limiteSaque) {
	        System.out.println("Transferência não permitida.");
	    } else {
	        saldo = saldo - valor;
	        contaX.saldo = contaX.saldo + valor;
	    }
	}
	
	void info() {
		System.out.println("Nome: " + correntista);
		System.out.println("Saldo: " + saldo);
		System.out.println("Limite: " + limiteSaque);
	}

	@Override
	public String toString() {
		return "Saldo: " + saldo;
	}
	
	
	
}
