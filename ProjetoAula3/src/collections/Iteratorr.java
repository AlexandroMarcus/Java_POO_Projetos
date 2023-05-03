package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorr {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Maca");
		lista.add("Manga");
		lista.add("Abacate");
		lista.add("Laranja");
		lista.add("Pessego");
		
		System.out.println("Os elementos: ");
		for(String s : lista) {
			System.out.println(s);
		}
		
		//Forma alternativa
		/* 
		for(int i=0;i<lista.size();i++) {
			System.out.println(lista);
		}
		*/
		
		Iterator<String> it = lista.iterator();
		System.out.println("atualizar para o proximo item da lista: " + it.next()); //atualiza para o proximo item da lista: Maca.
		String str = "";
		
		while(it.hasNext()) {
			str = (String) it.next();
			it.remove();
			System.out.println("Manga removida ");
			break;
		}
		
		System.out.println("Os elementos");
		for(String s : lista) {
			System.out.println(s);
		}
		
		
		
		
	}
 
}
