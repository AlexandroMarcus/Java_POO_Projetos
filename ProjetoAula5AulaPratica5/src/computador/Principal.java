package computador;

import java.util.ArrayList;

public class Principal {
	public static void main(String[]args) {
		
		Desktop compA = new Desktop(8,4,600);
		Notebook compB = new Notebook(8,4,15);
		Computador comp;
		comp = compA;
		
		ArrayList<Computador> listaComputadores = new ArrayList<Computador>();
		
		listaComputadores.add(compA);
		listaComputadores.add(compB);
		listaComputadores.add(new Desktop(16,8,1200));
		listaComputadores.add(new Notebook(16,8,18));
		
		System.out.println("------");
		System.out.println("Valor: " + comp.calcularValor());
		comp = compB;
		System.out.println("------");
		System.out.println("Valor: " + comp.calcularValor());
		
		//total do valor de todos os computadores somados
		double total=0;
		for(Computador c : listaComputadores) {
			total = total+c.calcularValor();
		}
		System.out.println("Total do valor: " + total);
	}
}
