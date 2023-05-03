package bibliotecadoalexandro.com;

public class LivroFisico extends Livro{
	private int tiragem;
	private int peso;
	
	public LivroFisico() {
		
	}
	
	LivroFisico(String titulo, Autor autor, String genero, int edicao, int tiragem, int peso){
		super(titulo, autor, genero,edicao);
		this.tiragem = tiragem;
		this.peso = peso;
	}
	
	public int getTiragem() {
		return tiragem;
	}
	public void setTiragem(int tiragem) {
		this.tiragem = tiragem;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}	
	
	@Override
	//Não é boa prática replicar trechos de código, então:
	public void info() {
		super.info(); //super fáz referência a classe mãe.
		System.out.println("Tiragem: " + tiragem);
		System.out.println("Peso: " + peso);
	}
}
