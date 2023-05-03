package avaliação;

public class Principal {

	public static void main(String[] args) {	
		Avaliacao mario = new Avaliacao(7,4,10);
		
		System.out.println("Media aritmetica do mario: " + mario.mediaAritmetica());
		System.out.println("Media ponderada do mario: " + mario.mediaPonderada());

		System.out.println("\n");
		
		Avaliacao luigi = new Avaliacao();
		luigi.n1 = 5;
		luigi.n2 = 9;
		luigi.n3 = 6;
		
		System.out.println("Media aritmetica do luigi: " + mario.mediaAritmetica());
		System.out.println("Media ponderada do luigi: " + mario.mediaPonderada());

	}

	

}
