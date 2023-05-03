package com.empresa;

public class Principal {
	public static void main(String[] args) {
		Conta c1 = new Conta("Mario",5000);
		Conta c2 = new Conta("Luigi",2000);
		
		try {
			c1.info();
			c1.depositar(300);
			c1.info();
			c1.sacar(8000);
			c1.info();
		}catch(Exception e) {
			System.out.println("Ocorreu um problema! " + e);
			System.out.println(e.getMessage()); /*todas as esseções possuem esse método getMessage() 
			ele vai resgatar a mensagem do erro*/;
		}finally {
			System.out.println("Fechando o programa!");
		}
	}
}
