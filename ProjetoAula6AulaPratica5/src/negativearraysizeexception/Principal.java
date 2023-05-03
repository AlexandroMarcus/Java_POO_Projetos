package negativearraysizeexception;

public class Principal {
	public static int[] instanciaArray(int i) {
		return new int[i];
	}
	
	public static void main(String[] args) {
		int tam = 10;
		
		int arry[];
		
		try {
			int conta = 10;
			arry = instanciaArray(tam);
			for(int i=0;i<tam;i++) {
				System.out.println(arry[i]);
			}
		}
		catch(ArithmeticException e) {
			System.out.println("Impossível dividir por zero");
		}
	}
}
