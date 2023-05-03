package entradadedados;

import java.util.Scanner;	//obs1

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);	//obs2
		System.out.println("Digite a sua idade: ");
		int idade = teclado.nextInt();
	}

}
