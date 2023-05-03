package formageometrica;

import java.util.Scanner;

public class Circulo extends FormaGeometrica{
	public void calculaArea() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o raio: ");
		
		double raio = teclado.nextDouble();
		area = raio*Math.PI;
	}
}
