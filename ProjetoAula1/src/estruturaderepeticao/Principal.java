package estruturaderepeticao;

public class Principal {

	public static void main(String[] args) {
		int contador=0;
		while(contador<5) {
			contador++;
			System.out.println(contador);
		}
		System.out.println("------------");
		contador=6;
		do {
			contador--;
			System.out.println(contador);
		}while(contador>0);
		System.out.println("------------");
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}
	}

}
