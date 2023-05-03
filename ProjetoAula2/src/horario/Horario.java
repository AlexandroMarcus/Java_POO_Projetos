package horario;

public class Horario {
	int hora;
	int minuto;
	int segundo;

	Horario(int hora, int minuto, int segundo){
		if(hora < 0 && hora > 23) {
			System.out.println("Erro!");
			this.hora = 0;
		}
		else if(minuto < 0 && minuto > 23) {
			System.out.println("Erro!");
			this.minuto = 0;
		}
		else if(segundo < 0 && segundo > 23) {
			System.out.println("Erro!");
			this.segundo = 0;
		}
		else {
			this.hora = hora;
			this.minuto = minuto;
			this.segundo = segundo;
		}
		
	}
		
	
	Horario(int hora){
		if(hora > 0 && hora < 23) {
			this.hora = hora;
			this.minuto = 0;
			this.segundo = 0;
		}
		else {
			this.hora = 0;
			System.out.println("Erro!");
		}
		
	}
	
	Horario(){}
	
	public void info() {
		System.out.println("Hora: " + hora);
		System.out.println("Minuto: " + minuto);
		System.out.println("Segundo: " + segundo);
	}
}
