package carro;

public class Principal {

	public static void main(String[] args) {
		Carro McQueen = new Carro();
		McQueen.cor = "Vermelho";
		McQueen.modelo = "Mazda";
		McQueen.velocidade = 220;

		Carro Ramirez = new Carro();
		Ramirez.cor = "Amarelo";
		Ramirez.modelo = "Ferrari";
		Ramirez.velocidade = 250;
		
		Carro Sally = new Carro();
		Sally.cor = "Azul";
		Sally.modelo = "Porche";
		Sally.velocidade = 210 + Sally.acelerar(50);
		System.out.println("A velocidade e: " + Sally.velocidade);
	}

}
