package nota;

public class Principal {

	public static void main(String[] args) {
		Nota mario = new Nota();
		
		mario.n1 = 9f;
		mario.n2 = 7f;
		mario.n3 = 8.5f;
		
		float resultado = mario.aritmetica();
		
		System.out.println("Aritmetica: " + mario.aritmetica());
		
		resultado = mario.ponderada();
		
		System.out.println("Ponderada: " + mario.aritmetica());
	}

}
