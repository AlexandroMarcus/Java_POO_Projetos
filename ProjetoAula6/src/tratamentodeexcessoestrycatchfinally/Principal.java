package tratamentodeexcessoestrycatchfinally;

public class Principal {
	static void funcao() {
		try {
			throw new NullPointerException("Problema");
		}
		catch(Exception e) {
			System.out.println("funcao(): " + e);
			throw e;
		}
	}

	public static void main(String[] args) {
		try {
			funcao();
		}
		catch(NullPointerException e) {
			System.out.println("main(): " + e);
		}
	}
}


