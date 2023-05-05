package notas;

public class Principal {

	public static void main(String[] args) {
		
		Nota mario = new Nota();
		
		System.out.println("Media Mario: ");
		mario.setNota1(9);
		mario.setNota2(10);
		mario.setFaltas(5);
		
		mario.resultado();
		
		mario.setNota1(2);
		mario.setFaltas(10);
		
		Nota luigi = new Nota(2,5,5);
		System.out.println("Media Luigi");
		luigi.resultado();
		

		
	}

}
