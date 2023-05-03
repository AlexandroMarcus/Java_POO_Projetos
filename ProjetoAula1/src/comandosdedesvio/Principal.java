package comandosdedesvio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int idade;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a sua idade: ");
		
		idade = teclado.nextInt();
		
		if(idade<10) {
			System.out.println("Criança");
		}
		else if(idade<18) {
			System.out.println("Adolescente");
		}
		else {
			System.out.println("Adulto");
		}
		
		switch(idade) {
		case 0,1,2,3,4,5,6,7,8,9,10:
			System.out.println("Crianca");
			break;
		case 11,12,13,14,15,16,17:
			System.out.println("Adolescente");
			break;
		default:
			System.out.println("Adulto");
		}

	}

}
