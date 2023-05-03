package equals;

public class Principal {
	public static void main(String[] args) {
		Usuario m1 = new Usuario(1,"Mario","111.222.333-44");
		Usuario m2 = new Usuario(1,"Mario","111.222.333-44");
		Usuario m3 = new Usuario(2,"Luigi","111.222.333-44");
		
		//maneira correta padrão
		System.out.println(m1.equals(m2));	//true
		
		//maneira errada, forado padrão
		System.out.println(m1==m2);			//false
		
		System.out.println(m1.equals(m3));	//false
	}
}
