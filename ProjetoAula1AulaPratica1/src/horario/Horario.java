package horario;

public class Horario {
	int hora;
	int minutos;
	int segundos;
	
	Horario(int hora, int minutos, int segundos){

		if(hora >=0 && hora < 23) {
			this.hora = hora;
		}
		else {
			System.out.println("Voce digitou um valor de hora invalido!");
			this.hora = 0;
		}
		
		if(minutos >= 0 && minutos < 59) {
			this.minutos = minutos;
		}
		else {
			System.out.println("Voce digitou um valor de minuto invalido!");
			this.minutos = 0;
		}

		if(segundos >= 0 && segundos < 59) {
			this.minutos = segundos;
		}
		else {
			System.out.println("Voce digitou um valor de segundos invalido!");
			this.segundos = 0;
		}
	}
	
	Horario(int hora){
		if(hora >= 0 && hora < 23) {
			this.hora = hora;
			this.minutos = 0;
            this.segundos = 0;
		}
		else {
			System.out.println("Voce digitou um valor de hora invalido!");
			this.hora = 0;
			this.minutos = 0;
            this.segundos = 0;
		}
	}
	
	Horario(){}
	
	public void info() {
		System.out.printf("h: %d, m: %d, s: %d", hora , minutos, segundos);
	}
	

}
