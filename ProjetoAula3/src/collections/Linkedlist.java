package collections;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> listaNomes = new LinkedList<String>();
		
		listaNomes.add("Mario");
		listaNomes.add("Luigi");
		listaNomes.add("Peach");
		listaNomes.add("Yoshe");
	
		System.out.println(listaNomes);
		
		String item1 = listaNomes.get(0);
		//listaNomes.get();
		
		System.out.println("Item 1 na posicao 1 da minha listaNomes: " + item1);
		
		String item2 = listaNomes.remove();
		
		System.out.println(listaNomes);
		listaNomes.size();
		System.out.println(listaNomes);
		
		
		listaNomes.clear();
	}

}
