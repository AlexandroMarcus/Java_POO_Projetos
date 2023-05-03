package modificadoresdevisibilidade;

public class ModificadorStatic {
	public static void main(String[]args) {
		int minhaIdade = ClassStatic.idade;
		System.out.println(minhaIdade);
		
		int []numeros = {1,2,3,4,5};
		int media = ClassStatic.calcularLista(numeros);
		System.out.println(media);
	}
}
