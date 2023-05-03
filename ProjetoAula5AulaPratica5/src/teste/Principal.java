package teste;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Alexandro",22);
		Pessoa p2 = new Pessoa("Emily",22);
		
		ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		listaPessoas.add(new Pessoa("Alexandro",22));
		listaPessoas.add(new Pessoa("Emily",22));
		listaPessoas.add(new Pessoa("Emilyy",22));
		
		for(Pessoa pessoa : listaPessoas) {
			System.out.println(pessoa.getNome()+pessoa.getIdade());
		}
	}

}
