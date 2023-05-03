package collections;

import java.util.ArrayList;
import java.util.Collections;

public class MetodosEstaticosCollections {

	public static void main(String[] args) {
		//Criando lista de Strings
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("Mario");
		lista.add("Luigi");
		lista.add("Yoshe");
		lista.add("Toad");
		lista.add("Peach");
		
		//Imprime a lista na ordem original
		System.out.println(lista);
		
		//Coloca a lista em uma ordem aleatória
		Collections.shuffle(lista);
		System.out.println(lista);
		
		//Coloca a lista em uma ordem alfabética
		Collections.sort(lista);
		System.out.println(lista);
		
		//Inverte a ordem anterior da lista
		Collections.reverse(lista);
		System.out.println(lista);
		
		//Maior elemento alfabético
		System.out.println("Maior: " + Collections.max(lista));
		
		//Menor elemento alfabético
		System.out.println("Menor: " + Collections.min(lista));
		
	}

}
