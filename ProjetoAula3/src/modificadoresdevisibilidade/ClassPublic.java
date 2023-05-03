package modificadoresdevisibilidade;

public class ClassPublic {
	public String carro;
	
	public ClassPublic(String carro) {
		this.carro = carro;
	}

	public ClassPublic() {}
	
	public String toString() {
		return "meu carro: " + carro;
	}
}
