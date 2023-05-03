package collections;

/*Se o nome da classe já se chama ArrayList, não da pra criar um objeto do tipo ArrayList. O eclipse confunde o nome da classe do
 * pacote com o nome da classe do objeto. O erro pede para remover de dentro do operador diamante<> o tipo do dado que sera
 * armazenado na lista*/

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> pessoas = new ArrayList<String>();
		
		pessoas.add("Mario"); //adicao de novos elementos
		pessoas.add("Luigi");
		pessoas.add("Peach");
		pessoas.add("Yoshe");
		
		System.out.println(pessoas);
		
		String item0 = pessoas.get(0); //retorna o item0 na posição 0
		
		System.out.println("\nMostrar o item 0 na posicao 0 da minha lista pessoas: " + item0);
		System.out.println("Mostrar a posicao 0 da minha lista pessoas " + pessoas.get(0)); 
		
		String item3 = pessoas.remove(3); //remove o item3 na posicao 3
		System.out.println("\n" + pessoas);
		
		int total = pessoas.size(); //retorna a quantidade de elementos em um lista
		System.out.println(total);
		
		pessoas.clear(); //remove todos os elementos
		System.out.println(pessoas);
		 
	}

}
