package conta;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Conta do Alexandro");
		Conta alexandro = new Conta();
		alexandro.correntista = "Alexandro";
		alexandro.saldo = 1000;
		alexandro.limiteSaque = 200;
		alexandro.info();
		System.out.println();
		
		System.out.println("Valor sacado: ");
		alexandro.sacar(90);
		System.out.println(alexandro.toString());
		System.out.println();
		System.out.println("Valor depositado: ");
		alexandro.depositar(20);
		System.out.println(alexandro.toString());
		System.out.println();
		
		System.out.println("Conta da Pessoa");
		Conta pessoa = new Conta();
		pessoa.correntista = "Pessoa";
		pessoa.saldo = 2000;
		pessoa.limiteSaque = 200;
		pessoa.info();
		System.out.println();
		
		System.out.println("Valor sacado");
		pessoa.sacar(50);
		System.out.println(pessoa.toString());
		System.out.println();
		System.out.println("Valor depositado: ");
		pessoa.depositar(20);
		System.out.println(pessoa.toString());
		System.out.println();
		
		System.out.println("Tranferindo valor para a conta...");
		System.out.println();
		System.out.println("Transferencia bem sucedida!");
		alexandro.transferir(pessoa, 200);
		System.out.println();
		
		System.out.println("Conta do Alexandro");
		alexandro.info();
		System.out.println();
		
		System.out.println("Conta da Pessoa");
		pessoa.info();
	}

}
