package estacao;

public class Principal {
	public static void main(String[]args) {
		Estacao estacaoRoupa = Estacao.INVERNO;
		
		switch(estacaoRoupa) {
		case VERAO:
			System.out.println();
			break;
		case OUTONO:
			System.out.println("Passe o outono com elegância");
			break;
		case INVERNO:
			System.out.println("Se agasalhe bem");
			break;
		case PRIMAVERA:
			System.out.println("Se vista bem na estação das flores");
			break;
		}
	
	}
}
