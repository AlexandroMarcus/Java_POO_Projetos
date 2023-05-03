package horario;

public class Principal {

	public static void main(String[] args) {
		Horario hora = new Horario(12, 23, 55);
		hora.info();
		System.out.println("\n");
		Horario hora1 = new Horario(5,9,11);
		hora1.info();
		System.out.println("\n");
		Horario hora2 = new Horario(24,32,22);
		hora2.info();
		
	}

}
