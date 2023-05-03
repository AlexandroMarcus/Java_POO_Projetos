package exemplopraticodepolimorfismo;

import java.util.ArrayList;

public class Principal {
	public static void main(String[]args) {
		Comissionado c = new Comissionado("Mario",50000,0.05f);
		System.out.println("Comissionado: " + c.pagamento());
		Horista h = new Horista("Luigi",100,40.5f);
		System.out.println("Horista: " + h.pagamento());
		Assalariado a = new Assalariado("Yoshi",3500);
		System.out.println("Assalariado: "+ a.pagamento());
		
		ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
		listaFuncionarios.add(new Horista("Mario",100,40.5f));
		listaFuncionarios.add(new Comissionado("Luigi",50000,0.05f));
		listaFuncionarios.add(new Assalariado("Yoshi",3500));
		
		float totalPagamento=0;
		for(Funcionario f : listaFuncionarios) {
			totalPagamento+=f.pagamento();
			//totalPagamento = totalPagamento+f.pagamento();
		}
		System.out.println("Total pagamento: " + totalPagamento);
	} 
}
