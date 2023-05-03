package collections;

import java.util.PriorityQueue;
 
public class Priotityqueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> fila = new PriorityQueue<Integer>(); 
		
		//Adicionando elementos para fila usando add();
		fila.add(10);
		fila.add(20);
		fila.add(15);
		
		//Imprimindo o elemento no topo da fila
		System.out.println(fila.peek());
		
		//Imprimindo e ao mesmo tempo removendo o primeiro elemento
		System.out.println(fila.poll());
		
		//Imprimindo o elemento do topo novamente
		System.out.println(fila.peek());
	}

}
