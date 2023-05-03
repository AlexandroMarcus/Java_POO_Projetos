package modificadoresdevisibilidade;

public class ClassStatic {
	public static int idade = 22;
	
	public static int calcularLista(int []listaNumeros) {
		int soma = 0;
		for(int n : listaNumeros) {
			soma = soma+n;
		}
		return soma / listaNumeros.length;
	}
	
}
