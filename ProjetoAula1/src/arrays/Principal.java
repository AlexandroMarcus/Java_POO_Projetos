package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String [] nomes = {"Mario","Luigi","Peach","Yoshi"};
		nomes[0] = "Bowser";
		System.out.println(nomes[0]);
		System.out.println();
		
		int [] megaSena = new int [3]; //reservando um espaço na memoria para o meu array
		megaSena[0] = 4;
		megaSena[1] = 5;
		megaSena[2] = 9;
		
		ArrayList<String> listaNomes = new ArrayList<String>();
		Scanner teclado = new Scanner(System.in);
		
		int qtd;
		
		System.out.println("Digite a quantidade de nomes: ");
		qtd = teclado.nextInt();
		
		System.out.println("Adicione os nomes na lista: ");
		
		for(int i=0;i<qtd;i++) {
			String nome = teclado.next();
			listaNomes.add(nome);
		}
		
		System.out.println("Lista de nomes na ordem normal: \n" + listaNomes);
		System.out.println();
		Collections.reverse(listaNomes);
		System.out.println("Lista de nomes na ordem reversa: \n" + listaNomes);
		

		
		
	}

}
