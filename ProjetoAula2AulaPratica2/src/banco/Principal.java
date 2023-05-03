package banco;

public class Principal {

	public static void main(String[] args) {
		Conta mario = new Conta(111,"Mario",1000,200);
		
		mario.info();
		
		System.out.println("\n");
		
		if(! mario.sacar(200)) {
			System.out.println("Problema ao sacar!");
		}
		
		if(! mario.depositar(400)) {
			System.out.println("Problema ao depositar");
		}
		mario.info();
		
		System.out.println("\n");
		
		Conta luigi = new Conta(222,"Luigi",1000,200);
		mario.transferir(luigi,100);
		
		luigi.info();

	}

}
