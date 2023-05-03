package instanceoff;

public class Principal {
	public static void main(String[] args) {
		Animal a = new Animal();
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Cachorro c = new Cachorro();
		
		System.out.println(m instanceof Animal);
		System.out.println(r instanceof Animal);
		System.out.println(c instanceof Mamifero);		
	}
}
