package construtoreheranca;

public class Base {
	int x ;
	Base(){
		System.out.println("Construtor Base");
	}
	Base(int x){
		super();
		this.x = x;
	}
}
