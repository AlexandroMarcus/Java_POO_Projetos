package imprimivel;

public class Carro implements Imprimir{
	String modelo;
	String cor;
	int portas;
	
	public Carro(String modelo, String cor, int portas) {
		this.modelo = modelo;
		this.cor = cor;
		this.portas = portas;
	}
	@Override
	public void imprimir() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Cor: " + cor);
		System.out.println("Portas: " + portas);
		System.out.println("---------------");
	}
}
