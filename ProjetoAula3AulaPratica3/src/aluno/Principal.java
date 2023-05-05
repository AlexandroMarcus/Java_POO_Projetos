package aluno;

public class Principal {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Mario",111,0.1,new Curso("Engenharia",1000));
			
		a1.info();
		System.out.println("Pagamento: " + a1.pagamento());
		
		int[] megaSena = new int[3];
		megaSena[0] = 1;
		megaSena[0] = 2;
		megaSena[0] = 3;
		
	}

}
