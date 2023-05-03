package computador;

public abstract class Computador {
	int gbMemoria;
	int numProcessadores;
	
	public Computador(int gbMemoria, int numProcessadores) {
		super();
		this.gbMemoria = gbMemoria;
		this.numProcessadores = numProcessadores;
	}
	public abstract double calcularValor();
}
