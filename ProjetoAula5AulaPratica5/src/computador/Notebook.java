package computador;

public class Notebook extends Computador{
	int polegadasTela;
	
	public Notebook(int gbMemoria,int numProcessadores, int polegadasTela) {
		super(gbMemoria,numProcessadores);
		this.polegadasTela = polegadasTela;
	}
	@Override
	public double calcularValor() {
		return 250*gbMemoria+500*numProcessadores*500 + polegadasTela*100;
	}
}
