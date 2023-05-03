package leonidas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int adivinha; 
		int valorCorreto = 10000;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Essa guerra ai e contra quantos ? Porque ai a gente vai ai gente ja vai ne: ");
		
		adivinha = teclado.nextInt();
		
		while(adivinha!=valorCorreto) {
			if(adivinha<valorCorreto) {
				System.out.println("Um pouco mais...");
			}
			else {
				System.out.println("Um pouco menos...");
			}
			adivinha = teclado.nextInt();
		}
		
		System.out.println("Parabéns voce acertou!");
		teclado.close();
		
		//operador ternario
		/*while(adivinha!=valorCorreto) {
			String msg = adivinha<valorCorreto?"Um pouco mais...":"Um pouco...";
		}
		
		System.out.println("Parabéns você acertou!");*/
	}

}
