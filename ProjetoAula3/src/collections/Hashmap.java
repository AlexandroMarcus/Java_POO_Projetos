package collections;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<String, String> capitais = new HashMap<String, String>();
		
		capitais.put("Brasil","Brasilia");
		capitais.put("Argentina", "Buenos Aires");
		capitais.put("Paraguai","Assuncao");
		capitais.put("Uruguai","Montevideu");
		
		System.out.println("Capitais: " + capitais + capitais.size()); //imprimindo todas as capitais
	
		System.out.println(capitais.get("Brasil")); //Imprimindo só a a capital do Brasil
		
		System.out.println(capitais.get("Uruguai")); //Imprimindo só a capital do Uruguai

	}

}
