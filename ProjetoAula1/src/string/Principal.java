package string;

public class Principal {

	public static void main(String[] args) {
		String nome = "Mario";
		nome = "Super" + nome;
		System.out.println("Nome: " + nome); /*Concatenando com o sinal de + */
		
		nome = "Luigi";
		nome = "Super" + nome;
		System.out.printf("Nome: %s" , nome); /*Concatenando com o sinal de , */

	}

}
