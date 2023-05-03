package singletone;

public class Principal {
	public static void main(String[] args) {
		//instantig Singleton class whit variable x
		Singleton x = Singleton.getInstancia();
		
		//instantig Singleton class whit variable x
		Singleton y = Singleton.getInstancia();
				
		//instantig Singleton class whit variable x
		Singleton z = Singleton.getInstancia();
		
		//changing variable of instance x
		x.numero += 10;
		
		System.out.println(x.numero);
		System.out.println(y.numero);
		System.out.println(z.numero);
		//Todos imprimem 30
		
		z.numero -= 5;
		System.out.println(x.numero);
		System.out.println(y.numero);
		System.out.println(z.numero);
		//Todos imprimem 25
	}
}
