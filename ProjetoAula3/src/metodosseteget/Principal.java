package metodosseteget;

public class Principal {

	public static void main(String[] args) {
		Horario relogio = new Horario();
		relogio.setHora(22);
		
		System.out.println("A hora e: " + relogio.getHora());
		
		relogio.setMinuto(33);
		System.out.println("O minuto é: " + relogio.getMinuto());
		
		relogio.setSegundo(12);
		System.out.println("O segundo é: " + relogio.getSegundo());
		
		//relogio.info();
	}

}
