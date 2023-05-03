package construtoreheranca;

public class Derivada extends Base{
	int y;
	Derivada(){
		System.out.println("Construtor Derivada");
	}
	Derivada(int x, int y){
		super(x);
		this.y = y;
	}
	public void exibir() {
		System.out.println("x = " + x + " y = " + y);
	}
}
