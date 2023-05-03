package metodosseteget;

public class Horario {
	private int hora;
	private int minuto;
	private int segundo;
	
	public void setHora(int h) {
		if(hora>0 || hora <=23) {
			hora = h;
		}
		else {
			System.out.println("Erro! Digite um valor de hora que seja valido!");
		}
	}
	
	/*ou*/
	
	/*
	 * public void setHora(int hora){
	 * 		if(hora>0 || hora<23){
	 * 			this.hora = hora;
	 * 		}
	 * 		else{
	 * 			System.out.println("Erro! Digite um valor de hora que seja valido!")
	 * 		}
	 * }
	 * 
	 */

	public int getHora() {
		return hora;
	}
	
	public void setMinuto(int m) {
		if(minuto>0 || minuto<=59) {
			minuto = m;
		}
		else {
			System.out.println("Digite um valor de minuto que seja valido!");
		}
	} 
	
	/*ou*/
	
	/*
	 * public void setMinuto(int minuto){
	 * 		if(minuto>0 || minuto<23){
	 * 			this.minuto = m;
	 * 		}
	 * 		else{
	 * 			System.out.println("Erro! Digite um valor de minuto que seja valido !");
	 * 		}
	 * }*/
	
	
	public int getMinuto() {
		return minuto;
	}
	
	public void setSegundo(int s) {
		if(segundo>0 || segundo<59) {
			segundo = s;
		}
		else {
			System.out.println("Erro! Digite um valor de segundo que seja valido!");
		}
	}
	
	/*ou*/
	
	/*
	 * public void setMinuto(int minuto){
	 * 		if(minuto>0 || minuto<59){
	 * 			this.minuto = minuto;
	 * 		}
	 * 		else{
	 * 			System.out.println("Erro! Digite um minuto que seja valido!");
	 * 		}
	 * }*/
	
	public int getSegundo() {
		return segundo;
	}
	
	public void info() {
		System.out.println("A hora e: " + hora);
		System.out.println("O minuto e: " + minuto);
		System.out.println("O segundo e: " + segundo);
	}
}
