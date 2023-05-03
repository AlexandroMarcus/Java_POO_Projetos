package banco;

public class Conta {
	int numero;
	String titular;
	float saldo;
	float limite;
	
	Conta(int numero, String titular, float saldo, float limite){
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	
	
	boolean sacar(float valor) {
		if(valor>limite || valor>saldo || valor<=0) {
			return false;
		}
		else {
			saldo = saldo-valor;
			return true;
		}
	}
	
	boolean depositar(float valor) {
		if(valor<=0) {
			return false;
		}
		else {
			saldo = saldo+valor;
			return true;
		}
		
	}
	
	void transferir(Conta outraPessoa, float valor) {
		if(valor>saldo || valor>limite) {
			System.out.println("Transferência não permitida!");
		}
		else {
			saldo = saldo-valor;
			outraPessoa.saldo = saldo+valor;
		}
	}
	
	void info() {
		System.out.println("Nome: " + titular);
		System.out.println("Numero: " + numero);
		System.out.println("Saldo: " + saldo);
		System.out.println("Limite de Saque: " + limite);
	}
	
}
