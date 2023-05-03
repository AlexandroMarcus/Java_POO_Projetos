package computador;

public class Desktop extends Computador{
	public double acessorios;
	
	public Desktop(int gbMemoria, int numProcessadores, double acessorios) {
		super(gbMemoria,numProcessadores);
		this.acessorios = acessorios;
	}

	public double calcularValor() {
		return gbMemoria*200 + numProcessadores*400 + acessorios;
	}
}
