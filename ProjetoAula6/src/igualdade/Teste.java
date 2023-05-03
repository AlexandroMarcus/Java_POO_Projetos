package igualdade;

public class Teste {
	public static void main(String[] args) {
		String s1 = new String("Olá");
		String s2 = new String("Olá");
		String s3 = s1;
		System.out.println(s1==s2); //false
		
		//Maneira correta de se comparar 2 objetos, se eles tem a mesma instância.
		System.out.println(s1.equals(s2)); //true
	}
}
