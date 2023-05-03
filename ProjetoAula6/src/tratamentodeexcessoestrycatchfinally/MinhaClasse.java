package tratamentodeexcessoestrycatchfinally;

public class MinhaClasse {
	public static void main(String[] args) {
		try {	//tente
			int[] meusNumeros = {1,2,3};
			System.out.println("meus Numeros: " + meusNumeros[10]);
		}catch(Exception e) {	//capturar
			System.out.println("Problema = " + e);
		}finally {	//finalmente
			System.out.println("Terminado o try catch");
		}	
	}
}
