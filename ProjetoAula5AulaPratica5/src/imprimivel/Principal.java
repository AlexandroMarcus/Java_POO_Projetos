package imprimivel;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		Funcionario f = new Funcionario("Mario","111.222.333-4");
		Carro c = new Carro("Palio","Cinca",4);
		Quadrado q = new Quadrado(10);
		
		Imprimir imp = f;
		imp.imprimir();
		imp=c;
		imp.imprimir();
		imp=q;
		imp.imprimir();
		
		ArrayList<Imprimir> lista = new ArrayList<Imprimir>();
		lista.add(f);
		lista.add(c);
		lista.add(q);
	} 
}
