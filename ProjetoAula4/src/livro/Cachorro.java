package livro;

public class Cachorro extends Mamifero{
	
	public static void main(String args[]) {
		Animal a = new Animal();
		Mamifero m = new Mamifero();
		Cachorro c = new Cachorro();
		
		System.out.println(m instanceof Animal);
		System.out.println(c instanceof Mamifero);
		System.out.println(c instanceof Cachorro);
	}
}
