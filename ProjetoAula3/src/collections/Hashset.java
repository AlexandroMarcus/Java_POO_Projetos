package collections;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		HashSet<String> nomes = new HashSet<String>();
		
		nomes.add("Mario");
		nomes.add("Luigi");
		nomes.add("Mario"); //Mario já existe portanto não será adicionado
		nomes.add("Peach");
		
		nomes.remove("Luigi");
		System.out.println(nomes); //Imprime todos os nomes
		
		if(nomes.contains("Luigi")) {	//Confere se existe o Luigi
			System.out.println("Ele está presente");
		}
		else {
			System.out.println("Nao esta presente");
		}
		
		
	}

}
