package singletone;

public class Singleton {
	//variavel estática que armazena uma instancia null.
	private static Singleton instancia = null;
	
	//variavel para teste
	public int numero;
	
	//construtor privado
	private Singleton() {
		numero = 20;
	}
	
	//método que retorna a instancia
	public static Singleton getInstancia() {
		if(instancia == null) {
			instancia = new Singleton();
		}
		return instancia;
	}
}
