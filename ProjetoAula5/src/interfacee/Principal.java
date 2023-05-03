package interfacee;

public class Principal {

	public static void main(String[] args) {
		Gato tom = new Gato();
		tom.Dormir();
		tom.emitirSom();
		Animal obj = tom;
		obj.Dormir();
		obj.emitirSom();
	}
}
