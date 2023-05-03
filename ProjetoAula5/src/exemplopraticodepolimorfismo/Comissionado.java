package exemplopraticodepolimorfismo;

public class Comissionado extends Funcionario{
	float comissao;
	float vendas;
	
	public Comissionado(String nome, float comissao, float vendas) {
		super(nome);
		this.comissao = comissao;
		this.vendas = vendas;
	}
	@Override //sobreescrita
	public float pagamento() {
		return comissao*vendas;
	}
}
